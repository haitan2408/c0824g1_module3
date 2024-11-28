<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="/add" method="post">
<%--    num1=1--%>
    Num 1: <input type="text" name="num1">
<%--    num2=2--%>
    Num 2: <input type="text" name="num2">
    <button type="submit">Add</button>
</form>
</body>
</html>