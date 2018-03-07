<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <#include "/public/commonCss.jsp">
    <#include "/public/commonJs.jsp">
</head>
<body ms-controller="demo">
<table class="layui-table">
    <tr>
        <td></td>
        <td></td>
    </tr>
</table>
<script type="text/javascript">
    var vm={
        tableData:[],
        loadTableData:function () {
            ajaxUtil.post("")
        }
    };
    vm=avalonFn.define("demo",vm);


</script>
</body>
</html>