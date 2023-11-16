<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ page import="java.util.List, model.Pessoa" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% List<Pessoa> listaPessoas = (List<Pessoa>) session.getAttribute("lista"); %>

<ul>
	<%for (Pessoa lista: listaPessoas) {%>
	<li>Nome: <%= lista.getNome()%>  Email: <%= lista.getEmail()%>  
	<a href="alterar.jsp?nome=<%= lista.getNome()%>">Alterar</a></li>
<%} %>
</ul>
 <a ref="CadastroPessoa.jsp">Voltar</a>
</body>
</html>