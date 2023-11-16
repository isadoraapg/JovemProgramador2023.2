lpackage senac.jp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import senac.jp.db.AlunoJDBCdao;
import senac.jp.dominio.Aluno;



@WebServlet("/ExcluirServlet")
public class ExcluirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("------------- Passei no servlet de excluir ------------");
		
		
		AlunoJDBCdao dao = new AlunoJDBCdao();
		Aluno aluno = new Aluno();
		String id = request.getParameter("id");
			
		aluno.setId(Integer.parseInt(id));
		dao.excluirAluno(aluno);
		
		
		ArrayList<Aluno> listaAlunos= dao.listarAlunos();			
		request.setAttribute("listaAlunos", listaAlunos);	
		

		// Encaminhar a requisição para o JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("listarAlunos.jsp");
		dispatcher.forward(request, response);
		
		
	}

	

}
