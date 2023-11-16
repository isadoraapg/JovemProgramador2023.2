<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 	String nome = (String) session.getAttribute("nome");
	if (nome != null){	
%>


<h1>Bem vindo</h1>

<!-- Conteúdo protegido -->
<p>CPF: xxx.xxx.xxx-xx</p>
<p>Agência: </p>
<p>Conta: </p>
<p>Saldo: </p>

<a href="LogoutServlet"> Sair</a>
<%} else{
		response.sendRedirect("login.jsp?error=2");
		}
		%>

</body>
</html>