<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, model.Produto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<Produto> lista = (List<Produto>) session.getAttribute("lista");
	String mensagem = (String) request.getAttribute("mensagem");
%>


<form action="EstoqueServlet" method="post">
	<select name="nomeProduto">
	<%if (lista != null){ %>
		<%for (Produto produto: lista){ %>
			<option value="<%=produto.getNome()%>"> <%=produto.getNome()%> </option>
		<%} %>
	<%} %>
	</select>
	Quantidade: <input type="number" name="quantidade" required>
	<input type="submit" name="acao" value="remover">
	<input type="submit" name="acao" value="adicionar">
</form>



<% if(mensagem != null){ %>
	<p><%=mensagem %></p>
<%} %>


<h2>Estoque:</h2>
<table border="1">
	<tr>
		<th>Produto</th>
		<th>Quantidade</th>
	</tr>
	
	<%if (lista != null){ %>
		<%for (Produto produto: lista){ %>
			<tr>
				<td><%=produto.getNome() %></td>
				<td><%=produto.getQuantidade() %></td>
			</tr>
		<%} %>
	<%} %>
	
</table>

<p><a href="historico.jsp"></a></p>

</body>
</html>