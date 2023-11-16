package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tabuada
 */
public class Tabuada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> tabuada = new ArrayList();
		
		int num1 = Integer.parseInt(request.getParameter("numero1"));
	 	int num2 = Integer.parseInt(request.getParameter("numero2"));
	 	
	 	for (int i = num1; i <=num2; i++) {
	 		for (int j = 1; j <=10; j++) {
	 			tabuada.add(i + " x " + j + " = " + (i*j));
	 		}
	 		tabuada.add("--------");
	 	}
	 		
	 		 		 	
	
		request.setAttribute("tabuada", tabuada);
		
		request.getRequestDispatcher("tabuada.jsp").forward(request, response);
	}

}
