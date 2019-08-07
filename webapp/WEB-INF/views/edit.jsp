<%--
  Created by IntelliJ IDEA.
  User: wangzichen
  Date: 2019/7/21
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form action="edit" method="post">
    <table align="center" cellspacing="0px" border="1px" width="70%">
        <tr>
            <td>修改用户信息</td>
        </tr>
        <tr>
            <td>Id</td>
            <td>
                <input type="text" name="id" value="${employee.id}">
            </td>
        </tr>
        <tr>
            <td>LastName</td>
            <td>
                <input type="text" name="lastName" value="${employee.lastName}" readonly>
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input type="email" name="email" value="${employee.email}">
            </td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>
                <input type="text" name="gender" value="${employee.gender}">
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
