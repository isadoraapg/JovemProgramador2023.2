<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="CoresServlet" method="post">
	<label><input type="checkbox" name="cores" value="amarelo">
	Amarelo
	</label><br>
	<label><input type="checkbox" name="cores" value="vermelho">
	Vermelho
	</label><br>
	<label><input type="checkbox" name="cores" value="laranja">
	Laranja
	</label><br>
	
	
	

		<label for="cores">Selecione sua cor favorita: </label> 
		<select name="cores" = multiple>
			<option value="vermelho">Vermelho</option>
			<option value="azul">Azul</option>
			<option value="amarelo">Amarelo</option>
		</select>
		<button type="submit">Enviar</button>

	</form>




</body>
</html>