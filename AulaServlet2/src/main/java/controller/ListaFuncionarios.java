package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaFuncionarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> listaFuncionarios = new ArrayList<>();
		
		listaFuncionarios.add("Funcionário 1");
		listaFuncionarios.add("Funcionário 2");
		listaFuncionarios.add("Funcionário 3");
	
		request.setAttribute("listaFuncionarios", listaFuncionarios);
		request.getRequestDispatcher("minhaPagina.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String setor = request.getParameter("setor");
		String funcao = request.getParameter("funcao");
		
	}

}
