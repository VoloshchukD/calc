<%@ page import="by.tms.learnservlet.entity.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: pagubnoe
  Date: 26.12.2019
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin" method="post">
   <%=request.getServletContext().getAttribute("users")%>
</form>
</body>
</html>
