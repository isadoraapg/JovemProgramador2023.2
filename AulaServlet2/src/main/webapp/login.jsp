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
	Usu�rio <input type="text" name="usuario" required><br><br>
	Senha <input type="password" name="senha" required><br><br>
	<input type="submit" value="Acessar">
</form>

<% String erro = request.getParameter("error");
	if (erro != null) { 
	
		if (erro.equals("1")){%>
			 <p> Usu�rio ou senha inv�lidos </p>
		<%} %>
		
		<% if (erro.equals("2")){ %>
		<p>Sess�o encerrada. Fa�a login novamente. </p>
		<%} %>
<% } %>


</body>
</html>