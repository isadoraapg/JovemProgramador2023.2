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

@WebServlet("/PesquisaServlet")
public class PesquisaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valor = request.getParameter("valor");	
		String tipoPesquisa = request.getParameter("tipoPesquisa");		
		
		
		AlunoJDBCdao dao = new AlunoJDBCdao();				
		ArrayList<Aluno> listaAlunos= dao.pesquisar(valor,tipoPesquisa);
		
		System.out.println(listaAlunos);
		
		request.setAttribute("listaAlunos", listaAlunos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listarAlunos.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
