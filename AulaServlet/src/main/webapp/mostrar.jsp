<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import= "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String nome = (String) request.getAttribute("nome");
String email = (String) request.getAttribute("email");
%>


<h2>Nome: <%=nome%></h2>
<br>
<h2>Email: <%=email%></h2>


</body>
</html>