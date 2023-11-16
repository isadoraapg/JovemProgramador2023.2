<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Tabuada</h2>
	<%
	int numero = 3;
	%>

	<h3>
		Tabuada do
		<%=numero%></h3>
	<ul>
		<%
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
		%>
		<li><%=numero%> x <%=i%> = <%=resultado%></li>
		<%
		}
		%>
	</ul>




</body>
</html>