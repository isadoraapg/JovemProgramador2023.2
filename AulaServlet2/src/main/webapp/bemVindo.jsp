<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% String nome = (String) session.getAttribute("nome"); %>
	
	<h2>Bem vindo, <%=nome %></h2>

<% session.setAttribute("sobrenome", "Peixoto"); %>

<a href="outraPagina.jsp"> Acesse outra pagina</a>

</body>
</html>