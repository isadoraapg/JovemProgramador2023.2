package senac.jp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import senac.jp.db.AlunoJDBCdao;
import senac.jp.dominio.Aluno;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/ListarServlet")
public class ListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		AlunoJDBCdao dao = new AlunoJDBCdao();				
		ArrayList<Aluno> listaAlunos= dao.listarAlunos();			
		request.setAttribute("listaAlunos", listaAlunos);			
		RequestDispatcher dispatcher = request.getRequestDispatcher("listarAlunos.jsp");
		dispatcher.forward(request, response);
		
		
	}

	

}
