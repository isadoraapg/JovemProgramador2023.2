package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		if (nome != null && email != null) {
			//tratamento de dados
			request.setAttribute("nome", nome);
			request.setAttribute("email", email);
			
			//encaminhando os atributos para uma outra pagina
			request.getRequestDispatcher("mostrar.jsp").forward(request, response);
			
			
			
			
		} else {
			
		}
		
		
		
	}

}
