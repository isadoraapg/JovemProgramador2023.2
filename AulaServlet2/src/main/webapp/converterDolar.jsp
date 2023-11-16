<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Conversor de Dólar para Real: </h1>

<form action = "ConversorDolarReal" method = "post">

<label for = "dolar">Digite o valor em Dólar: </label>
<input type = "number" id = "dolar" name = "dolar">

<button type = "submit">Enviar</button>

<% Double real = (Double) request.getAttribute("real");
	Double dolar = (Double) request.getAttribute("dolar");
%>

<% if (real != null){ %>
	<h2><%=dolar%> convertido em real: <%=real%></h2>
<%}%>


</form>
</body>
</html>