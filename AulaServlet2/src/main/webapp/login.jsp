<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="LoginServlet" method="post">
	Usuário <input type="text" name="usuario" required><br><br>
	Senha <input type="password" name="senha" required><br><br>
	<input type="submit" value="Acessar">
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


</body>
</html>