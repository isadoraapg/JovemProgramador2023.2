package senac.jp.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import senac.jp.db.AlunoJDBCdao;
import senac.jp.dominio.Aluno;


@WebServlet("/DetalharServlet")
public class DetalharServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("------------- Passei no servlet de detalhar ------------");
		
		AlunoJDBCdao dao = new AlunoJDBCdao();
		Aluno aluno = new Aluno();
		
		// Recupera o id do aluno que precisa ser detalhado
		String id = request.getParameter("id");	
		
		aluno.setId(Integer.parseInt(id));
		aluno = dao.pesquisarPorId(aluno);	
		request.setAttribute("aluno", aluno);	
		
		// Encaminhar a requisição para a pagina detalhar aluno
		RequestDispatcher dispatcher = request.getRequestDispatcher("detalharAluno.jsp");
		dispatcher.forward(request, response);
			
		
		
	}

	

}
