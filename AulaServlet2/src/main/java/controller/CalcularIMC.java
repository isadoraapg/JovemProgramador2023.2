package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularIMC
 */
public class CalcularIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		double altura = Double.parseDouble(request.getParameter("altura"));
	 	double peso = Double.parseDouble(request.getParameter("peso"));
	 	
	 	
	 	double imc = peso / (altura * altura);
	 	String resultado = "";
	 	
	 	if (imc <= 18.5) {
	 		resultado = "Abaixo do peso";
	 	}else if (imc > 18.5 && imc <= 24.9) {
	 		resultado = "Peso normal";
	 	}else if (imc >24.9 && imc <= 29.9) {
	 		resultado = "Sobrepeso";
	 	}else if(imc >29.9 && imc <= 34.9) {
	 		resultado = "Obesidade grau I";
	 	}else if(imc >34.9 && imc <= 39.9) {
	 		resultado = "Obesidade grau II";
	 	}else {
	 		resultado = "Obesidade grau III";
	 	}
	 	
	 	
	 	
	
		request.setAttribute("imc", imc);
		request.setAttribute("resultado", resultado);
		
		request.getRequestDispatcher("calcularIMC.jsp").forward(request, response);
		
	}

}
