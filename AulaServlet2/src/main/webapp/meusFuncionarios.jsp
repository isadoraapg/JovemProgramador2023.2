<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     <%@ page import="java.util.List" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% List<String> ListaFuncionarios = (List<String>) request.getAttribute("listaFuncionarios"); %>


<ul>
<% for (String item : ListaFuncionarios){ %>
<li><%= item %></li>
<%}%>

</ul>
 

</body>
</html>