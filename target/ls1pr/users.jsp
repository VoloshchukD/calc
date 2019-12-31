<%--
  Created by IntelliJ IDEA.
  User: pagubnoe
  Date: 26.12.2019
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<form>
<%= request.getServletContext().getAttribute("users").toString()%>
    </form>
</body>
</html>
