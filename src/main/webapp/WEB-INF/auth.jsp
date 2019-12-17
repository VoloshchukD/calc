<%--
  Created by IntelliJ IDEA.
  User: pagubnoe
  Date: 17.12.2019
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/auth" method="post">


    <label> Логин </label>
    <input type="text" name="login"/>
    <br/>
    <br/>
    <label> Пароль </label>
    <input type="text" name="password"/>
    <br/>
    <br/>
    <a href="${pageContext.request.contextPath}/auth"><button>Войти</button></a>
</form>

Вы вошли как <%=request.getSession().getAttribute("currentUser")%>
</body>
</html>
