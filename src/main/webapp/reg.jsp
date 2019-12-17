<%@ page import="by.tms.learnservlet.entity.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: pagubnoe
  Date: 16.12.2019
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/reg" method="post">

    <label> Имя пользователя </label>
       <input type="text" name="name"/>
    <br/>
    <br/>
       <label> Возраст </label>
       <input type="text" name="age"/>
    <br/>
    <br/>
        <label> Логин </label>
        <input type="text" name="login"/>
    <br/>
    <br/>
        <label> Пароль </label>
        <input type="text" name="password"/>
    <br/>
    <br/>
    <a href="${pageContext.request.contextPath}/reg"><button>Зарегистрироваться</button></a>
</form>

Здравствуйте <%=request.getServletContext().getAttribute("lastRegUserName")%>
</body>
</html>
