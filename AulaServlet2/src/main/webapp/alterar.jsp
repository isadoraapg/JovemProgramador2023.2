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

<h1>Alterar</h1>
<% List<Pessoa> listaPessoas = (List<Pessoa>) session.getAttribute("lista"); 

String nome = request.getParameter("nome");
Pessoa pessoa = null;
for (Pessoa p : listaPessoas){
	if (p.getNome().toString().equals(nome)) {
		pessoa = p;
	}
}


%>


<form action="AlterarPessoaServlet" method="post">

<input type="hidden" name="nomeAntigo" value="<%=pessoa.getNome() %>">


<label for="nome">Nome</label>
<input type="text" name="nome" value="<%=pessoa.getNome() %>" required>
<br><br>
<label for="email">E-mail</label>
<input type="text" name="email" value="<%=pessoa.getEmail() %>" required>
<br><br>
<input type="submit" value="Alterar">
</form>


</body>
</html>