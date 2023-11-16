<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	LocalDateTime agora = LocalDateTime.now();

	int horas = agora.getHour();
	String mensagem = "São " + horas + " horas. ";

	if ((horas >= 5) && (horas < 13)) {
		mensagem += "Bom dia!";
	} else if ((horas >= 13) && (horas < 19)) {
		mensagem += "Boa tarde!";
	} else {
		mensagem += "Boa noite!";
	}
	%>

	<h2>
		<%=mensagem%></h2>


</body>
</html>