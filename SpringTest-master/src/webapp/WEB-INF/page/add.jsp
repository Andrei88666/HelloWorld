<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: web
  Date: 26.06.2018
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ul>
    <c:forEach items="${names}" var="name" >
    <li>${name}</li>
    </c:forEach>
</ul>

<br>
<form action="/show/add" method="get" modelAttribute="student">
    <input type="text" name="name" value="base name">
    <input type="text" name="name2" value="base name">
    <input type="submit" value="add">
</form>

<a href="/show/del">Del</a>


</body>
</html>
