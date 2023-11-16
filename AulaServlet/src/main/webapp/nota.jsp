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
	String nome = request.getParameter("nome");
	String nota = request.getParameter("nota");

	out.println("Olá, " + nome + "! <br><br>");
	out.println("A nota que você deu ao curso foi: " + nota + "!");

%>




</body>
</html>