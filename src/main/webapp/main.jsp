<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <title>Main</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/main" method="post">
</form>
<br/>
<br/>
<a href="${pageContext.request.contextPath}/reg"><button>Зарегистрироваться</button></a>
<a href="${pageContext.request.contextPath}/auth"><button>Войти</button></a>
</body>
</html>