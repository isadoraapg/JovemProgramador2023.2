package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Pessoa;

/**
 * Servlet implementation class PessoaServlet
 */
public class PessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	private List<Pessoa> listaPessoas = new ArrayList<>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		Pessoa pessoa = new Pessoa(nome, email);
		listaPessoas.add(pessoa);
		
		HttpSession session = request.getSession(true);
		
		
		//colocar atributos na sessao
		session.setAttribute("lista", listaPessoas);
		request.getRequestDispatcher("sucesso.jsp").forward(request, response);
		
	}

}
