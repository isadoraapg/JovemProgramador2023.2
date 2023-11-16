package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Pessoa;

/**
 * Servlet implementation class AlterarPessoaServlet
 */
public class AlterarPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Pessoa> listaPessoas = (List<Pessoa>) session.getAttribute("lista");
		String nome = request.getParameter("nome");
		String nomeAntigo = request.getParameter("nomeAntigo");
		String email = request.getParameter("email");
		
		for (Pessoa p : listaPessoas){
			if (p.getNome().toString().equals(nomeAntigo)) {
				p.setNome(nome);
				p.setEmail(email);
			}
		}
		
		session.setAttribute("lista", listaPessoas);
		response.sendRedirect("Listagem.jsp");
	}

}
