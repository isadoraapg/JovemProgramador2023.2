package controller;

 

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

/**
* Servlet implementation class CalculadoraServlet
*/
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		String operacao = request.getParameter("operacao");
		String op = "";
		double resultado = 0;

		switch(operacao) {

		case "soma":
			resultado = num1 +num2;
			op = "soma";
			break;

		case "subtracao":
			resultado = num1 - num2;
			op = "subtração";
			break;

		case "multiplicacao":
			resultado = num1 * num2;
			op = "multiplicação";
			break;

		case "divisao":
			resultado = num1 / num2;
			op = "divisão";
			break;	
		}

		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("operacao", op);
		request.setAttribute("resultado", resultado);
		request.getRequestDispatcher("calculadora.jsp").forward(request, response);
	}

 

}