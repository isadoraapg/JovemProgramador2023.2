<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import = "java.util.List" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "Tabuada" method = "post">

<label for = "numero1">Digite o primeiro número: </label>
<input type = "text" id = "numero1" name = "numero1">

<label for = "numero2">Digite o segundo número: </label>
<input type = "text" id = "numero2" name = "numero2">

<button type = "submit">Enviar</button>
</form>


<%List<String> tabuada = (List<String>) request.getAttribute("tabuada"); %>

<%if (tabuada != null){ %>
	<ul>
	<%for(int i = 0; i < tabuada.size(); i++) { %>
	<li><%=tabuada.get(i) %></li>
	<%} %>
	</ul>
<%} %>


</body>
</html>