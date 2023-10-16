<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema Cadastro de Alunos</title>
</head>
<body>

<h1>Sistema Cadastro de Alunos</h1>

<h2>Informe seu usuário e senha</h2>
<form action="LoginServlet" method="post">
	<label for="usuario">Login: </label>
	<input type="text" name="usuario" required>
	<br>
	<label for="senha">Senha: </label>
	<input type="password" name="senha" required>
	<br>
	<input type="submit" value="Efetuar Login">
	<br>
	
</form>

<% String erro = request.getParameter("error");
	if (erro != null) { 
	
		if (erro.equals("1")){%>
			 <p> Usuário ou senha inválidos </p>
		<%} %>
		
		<% if (erro.equals("2")){ %>
		<p>Sessão encerrada. Faça login novamente. </p>
		<%} %>
<% } %>




<!-- <%=request.getAttribute("mensagem") == null ? "" : request.getAttribute("mensagem") %> -->
</body>
</html>