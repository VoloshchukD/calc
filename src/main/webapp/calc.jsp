
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/calc" method="post">

    <input type="text" name="num1">
    <input type="text" name="op" list="operations"/>
    <datalist id="operations">
        <option value="+">
        <option value="-">
        <option value="*">
        <option value="/">
    </datalist>

    <input type="text" name="num2">

    <a href="${pageContext.request.contextPath}/calc"><button>результат</button></a>

</form>

Ваш результат <%=request.getSession().getAttribute("result")%>

</body>
</html>
