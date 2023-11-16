<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ola</title>
</head>
<body>
<h2>Olá, mundo com JSP</h2>


<%
String mensagem = "Olá, Mundo. Tudo bem com você?";
out.println(mensagem);
%>

<br>
<h1><%=mensagem%></h1>











</body>
</html>