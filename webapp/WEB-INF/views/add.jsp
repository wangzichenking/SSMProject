<%--
  Created by IntelliJ IDEA.
  User: wangzichen
  Date: 2019/7/21
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form action="add" method="post">
    <table align="center" cellspacing="0px" border="1px" width="70%">
        <tr>
            <td>添加用户信息</td>
        </tr>
        <tr>
            <td>LastName</td>
            <td>
                <input type="text" name="lastName">
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input type="email" name="email">
            </td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>
                <input type="text" name="gender" onkeyup="limit(this);">
<%--                <script type="text/javascript">--%>
<%--                    function limit(o) {--%>
<%--                        var value=o.value;--%>
<%--                        if (!(value=="男"||value=="女")){--%>
<%--                            alert("输入错误！");--%>
<%--                        }--%>
<%--                    }--%>
<%--                </script>--%>
            </td>
        </tr>
        <tr>
            <td>
                <a href="/SSMProject/emps">返回</a>
            </td>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>

    </table>
</form>
</body>
</html>
