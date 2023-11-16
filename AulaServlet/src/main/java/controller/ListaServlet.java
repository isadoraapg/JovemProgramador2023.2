package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ListaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> minhaLista = new ArrayList<>();
		
		minhaLista.add("Item 1");
		minhaLista.add("Item 2");
		minhaLista.add("Item 3");
	
		request.setAttribute("listaItens", minhaLista);
		request.getRequestDispatcher("minhaPagina.jsp").forward(request, response);

	}

}
