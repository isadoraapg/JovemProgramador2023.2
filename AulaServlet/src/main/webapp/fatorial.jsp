<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Testando função fatorial:</h2>
	<%!public int fatorial(int n) {
		return (n < 1) ? 1 : n * fatorial(n - 1);
		//se n < 1 entra nessa condição, se não, entra dps do :
	}%>

	<%
	for (int i = 1; i <= 5; i++) {
	%>
	<p>
		O fatorial de
		<%=i%>
		é
		<%=fatorial(i)%>
	</p>

	<%
	}
	%>






</body>
</html>