<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript" src="${ctx}/js/avalon.shim.js" charset="utf-8"></script>
<script type="text/javascript" src="${ctx}/js/function.js" charset="utf-8"></script>
<script>
    var form = layui.form;

    //关闭对话框
    function closeDialog() {
        layui.layer.closeAll();
    }

    function closeParentDialog() {
        parent.layui.layer.closeAll();
    }

    function goBack() {
        window.history.back(-1);
    }

    //得到当前的日期
</script>