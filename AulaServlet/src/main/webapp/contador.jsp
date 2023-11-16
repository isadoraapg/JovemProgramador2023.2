<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! 
 // Declaração de método e variável de classe
 
 private String saudacao (String nome){
	return "Olá, " + nome + "!";
}
private int contador = 0;
%>


<p><%= saudacao("Isadora") %></p>

<% contador++; %>
<p>Esta página foi visitada <%=contador%> vezes.</p>




</body>
</html>