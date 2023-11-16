package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		
		//lógica de autenticação
		if("admin".equals(nome) && "admin".equals(senha)) {
			
			HttpSession session = request.getSession();
			
			//definir tempo de duração de sessão = 60 segundos
			session.setMaxInactiveInterval(60);
			
			
			session.setAttribute("nome", nome);
			
			//request.setAttribute("nome", nome);
			request.getRequestDispatcher("dashboard.jsp").forward(request, response);
			//response.sendRedirect("aluguelServlet");
		}else {
			response.sendRedirect("login.jsp?error=1");
		}
		
		
		
	}

}
