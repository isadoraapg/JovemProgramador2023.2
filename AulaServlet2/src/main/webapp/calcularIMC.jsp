<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Cálculo IMC: </h1>

<form action = "CalcularIMC" method = "post">

<label for = "altura">Digite a sua altura em 'm': </label>
<input type = "text" id = "altura" name = "altura">

<label for = "peso">Digite o seu peso em Kg: </label>
<input type = "text" id = "peso" name = "peso">

<button type = "submit">Enviar</button>

<% Double imc = (Double) request.getAttribute("imc");
	String resultado = (String) request.getAttribute("resultado");

%>

<% if (imc != null){ %>
	<h2>Seu IMC é: <%=imc%></h2>
	<br><br>
	<p><%=resultado%></p>
<%}%>

</form>
</body>
</html>