package senac.jp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import senac.jp.db.AlunoJDBCdao;
import senac.jp.dominio.Aluno;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("------------- Passei no servlet de login ------------");

		// Senha
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");

		// Encaminhar a requisição para o JSP
		if (usuario.equals("admin") && senha.equals("admin")) {
			
			HttpSession session = request.getSession(true);
			session.setMaxInactiveInterval(60);
			session.setAttribute("usuario", usuario); // Armazena o usuário na sessão
			
			AlunoJDBCdao dao = new AlunoJDBCdao();				
			ArrayList<Aluno> listaAlunos= dao.listarAlunos();			
			request.setAttribute("listaAlunos", listaAlunos);			
			RequestDispatcher dispatcher = request.getRequestDispatcher("listarAlunos.jsp");
			dispatcher.forward(request, response);
			
			
		} else {
			response.sendRedirect("index.jsp?error=1");
		}

	}
	
	
}
