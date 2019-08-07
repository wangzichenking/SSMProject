<%--
  Created by IntelliJ IDEA.
  User: wangzichen
  Date: 2019/7/21
  Time: 7:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List All Information</title>
</head>
<body>
<h1 align="center" style="color: red">员工信息名单</h1>
<table align="center" cellspacing="0px" border="1px" width="70%">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Gender</th>
        <th>Operations</th>
    </tr>
    <c:forEach items="${pageInfo.list}" var="emp">
        <tr align="center">
            <td>${emp.id}</td>
            <td>${emp.lastName}</td>
            <td>${emp.email}</td>
            <td>${emp.gender}</td>
            <td>
                <a href="editgo?id=${emp.id}">Edit</a>
                <a href="delete?id=${emp.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<h2 align="center"><a href="addgo">Add New Emp</a></h2>
<center>
    <p style="font-size: 26px">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
        页,总 ${pageInfo.total } 条记录</div></p>
    <a href="emps?page=${pageInfo.firstPage}">首页</a>
    <c:if test="${pageInfo.hasPreviousPage }">
        <a href="emps?page=${pageInfo.pageNum-1}">上一页</a>
    </c:if>

    <c:if test="${pageInfo.hasNextPage }">
        <a href="emps?page=${pageInfo.pageNum+1}">下一页</a>
    </c:if>

    <a href="emps?page=${pageInfo.lastPage}">最后页</a>
</center>
</body>
</html>
