package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cadastro
 */
public class cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Processar a minha requisição
		String mensagem = request.getParameter("mensagem");
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Ana");
		
		//Coloca um dado no request
		request.setAttribute("mensagem1", mensagem);
		request.setAttribute("ListaNomes", nomes);
		
		//Encaminha para jsp, para exibir os dados
		RequestDispatcher dispatcher = request.getRequestDispatcher("mostrar.jsp");
		dispatcher.forward(request, response);
		
		
		
		
	}

}
