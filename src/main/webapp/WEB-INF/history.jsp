<%--
  Created by IntelliJ IDEA.
  User: pagubnoe
  Date: 17.12.2019
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>History</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/history" method="post">
<%= request.getSession().getAttribute("history").toString()%>


    </form>


</body>
</html>
