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
 // Declara��o de m�todo e vari�vel de classe
 
 private String saudacao (String nome){
	return "Ol�, " + nome + "!";
}
private int contador = 0;
%>


<p><%= saudacao("Isadora") %></p>

<% contador++; %>
<p>Esta p�gina foi visitada <%=contador%> vezes.</p>




</body>
</html>