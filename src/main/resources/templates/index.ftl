<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <#include "/public/commonCss.jsp">
    <#include "/public/commonJs.jsp">
</head>
<body ms-controller="demo">
<form class="layui-form" action="" style="margin: 20px">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名：</label>
        <div class="layui-input-inline">
            <input type="text" name="userName" class="layui-input" placeholder="请输入用户名" lay-verify="required">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">角色类型：</label>
        <div class="layui-input-inline">
            <input type="text" name="roleType" class="layui-input" placeholder="请输入角色类型"  lay-verify="required">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">其他信息：</label>
        <div class="layui-input-inline">
            <input type="text" name="otherInfo" class="layui-input" placeholder="请输入其他信息" lay-verify="required">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label"></label>
        <div class="layui-input-inline">
            <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
        </div>
    </div>
</form>

<table class="layui-table">
    <table class="layui-table">
        <thead>
        <tr>
            <th>用户名</th>
            <th>角色信息</th>
            <th>其他信息</th>
            <th>创建时间</th>
            <th>修改时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr ms-repeat="tableData">
            <td>{{el.userName}}</td>
            <td>{{el.roleType}}</td>
            <td>{{el.otherInfo}}</td>
            <td>{{el.createTime|date('yyyy-MM-dd HH:mm:ss')}}</td>
            <td>{{el.updateTime|date('yyyy-MM-dd HH:mm:ss')}}</td>
            <td>
                <button class="layui-btn layui-btn-danger layui-btn-sm" ms-on-click="deleteUser(el.id)">删除</button>
                <button class="layui-btn layui-btn-sm">编辑</button>
            </td>
        </tr>
        </tbody>
    </table>
</table>
<div id="page"></div>
<script type="text/javascript">
    var vm = {
        tableData: [],
        page: {
            current: 1,
            size: 10,
            total:0
        },
        //加载用户信息的方法
        loadTableData: function () {
            ajaxUtil.get("${ctx}/user/query/page", vm.$model.page, true, function (data) {
                vm.tableData = data.data.records;
                vm.page.total = data.data.total;
                pageUtil.renderPage(vm.page, vm.loadTableData, "page");
            })
        }
    };

    //删除用户数据
    function deleteUser(id) {
        ajaxUtil.post("${ctx}/user/delete/" + id, "", false, function (data) {
            vm.loadTableData();
            layerUtil.success("删除成功");
        })
    }

    /**
     * 保存用户数据
     */
    form.on('submit(demo1)', function (data) {
        ajaxUtil.post("${ctx}/user/save", data.field, false, function (data) {
            layerUtil.success("保存成功")
            vm.loadTableData();
        })
        return false;
    });

    $(function () {
        vm = avalonFn.define("demo", vm);
        vm.loadTableData();
    })

</script>
</body>
</html>