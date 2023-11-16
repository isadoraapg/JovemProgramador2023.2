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


@WebServlet("/AlterarServlet")
public class AlterarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("------------- Passei no servlet de alterar ------------");
		
		
		AlunoJDBCdao dao = new AlunoJDBCdao();	
		Aluno aluno = new Aluno();
		
		// Recupera o atributo id do aluno que seve ser alterado
		String id = request.getParameter("id");	
		aluno.setId(Integer.parseInt(id));
		
		aluno = dao.pesquisarPorId(aluno);		

		// Adiciona o aluno no request, para exibir seus dados na pagina de alterar
		request.setAttribute("aluno", aluno);
		
		// Encaminhar a requisição para o JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("alterarAluno.jsp");
		dispatcher.forward(request, response);

		

	}

}
