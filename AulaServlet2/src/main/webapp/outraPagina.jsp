<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<% String nome = (String) session.getAttribute("nome"); 
	String sobrenome = (String) session.getAttribute("sobrenome");
	%>
	
	
	
	<h2>O nome capturado na sessão é:  <%=nome %></h2>

<h2>O sobrenome capturado na sessão é:  <%=sobrenome %></h2>
	

</body>
</html>