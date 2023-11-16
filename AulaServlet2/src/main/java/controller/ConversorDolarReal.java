package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ConversorDolarReal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	double taxaCambio = 4.87;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valorDolar = request.getParameter("dolar");
		double dolar = Double.parseDouble(valorDolar);
		
		
		double real = dolar * taxaCambio;
		
		
		
		request.setAttribute("dolar", dolar);
		request.setAttribute("real", real);
		
		request.getRequestDispatcher("converterDolar.jsp").forward(request, response);
		
		
	}

}
