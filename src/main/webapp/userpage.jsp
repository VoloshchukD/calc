<%--
  Created by IntelliJ IDEA.
  User: pagubnoe
  Date: 26.12.2019
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userpage</title>
</head>
<body>
<form>
    User
    <br/>
    <%=request.getSession().getAttribute("currentUser")%>
    <br/>
    <br/>
    History
    <br/>
    <%=request.getSession().getAttribute("history")%>

</form>
<br/>
<br/>
<br/>
<br/>
<a href="${pageContext.request.contextPath}/log"><button>выйти</button></a>
</body>
</html>
