<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Cadastro de Usuário</h1>

<form action = "CadastroUsuarioServlet" method = "post">

<label for = "nome">Digite seu nome: </label>
<input type = "text" id = "nome" name = "nome"><br>

<label for = "email">Digite seu email: </label>
<input type = "email" id = "email" name = "email"><br>

<button type = "submit">Enviar</button>

</form>

<p>	<% if (request.getAttribute("mensagem") == null){
	} else{ %>
	<%= request.getAttribute("mensagem")%>
	<%= request.getAttribute("email")%></p>
<%} %>

</body>
</html>