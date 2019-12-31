<%--
  Created by IntelliJ IDEA.
  User: pagubnoe
  Date: 21.12.2019
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/history" method="post">

</form>
<%=request.getSession().getAttribute("history")%>
</body>
</html>
