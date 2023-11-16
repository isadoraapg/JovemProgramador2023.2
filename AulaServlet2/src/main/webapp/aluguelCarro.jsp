<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

     <%@ page import="java.util.List"%>
     <%@ page import="model.Carro" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>

<body>

 

<%List<Carro> carros = (List<Carro>) request.getAttribute("carros");

String mensagem = (String) request.getAttribute("mensagem");%>

 

<h1>Aluguel de Carros</h1>

	<form action="aluguelServlet" method="post">

		<select name="modelo">

			<% if(carros != null) { %>

			

				<%for (Carro carro : carros) { %>

					

					<option value="<%= carro.getModelo()%>"> <%=carro.getModelo()%> </option>

					

			  	<%} %>

			<%} %>

			

		</select>

		

		<input type="submit" name="acao" value="alugar">

		<input type="submit" name="acao" value="devolver">

	</form>

	

	<%if (mensagem != null) { %>

		<h3><%=mensagem %></h3>

	<%} %>

	<br><br>

	

	<h2> Carros disponiveis</h2>

	

	<table border=1>

		<tr>

			<th>Modelo</th>

			<th>Disponivel</th>

		</tr>	

	<% if(carros != null) { %>

			<%for (Carro carro : carros) { %>

				<tr>

			<td><%=carro.getModelo() %></td>

			<td><%=carro.isDisponivel() == true ? "sim" : "não" %></td>

		</tr>

			<%} %>

	<%} %>

	</table>

</body>

</html>