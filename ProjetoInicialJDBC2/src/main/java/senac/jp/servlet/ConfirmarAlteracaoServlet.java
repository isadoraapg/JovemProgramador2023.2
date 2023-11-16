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



@WebServlet("/ConfirmarAlteracaoServlet")
public class ConfirmarAlteracaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("------------- Passei no servlet de confirmar alteração ------------");
		
		
		AlunoJDBCdao dao = new AlunoJDBCdao();			
		Aluno aluno = new Aluno();
		
		// Recuperar os valores informados	
		String id = request.getParameter("id");
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String genero = request.getParameter("genero");		
		String semestre = request.getParameter("semestre");		
		
		aluno.setId(Integer.parseInt(id));	
		aluno.setMatricula(matricula);	
		aluno.setNome(nome);
		aluno.setIdade(idade);
		aluno.setGenero(genero);
		aluno.setSemestre(semestre);	
		dao.alterarAluno(aluno);	
			
		// Guarda o aluno na requisição para mostrar na pagina de detalhes		
		request.setAttribute("aluno", aluno);
			
		// Encaminhar a requisição para o JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("detalharAluno.jsp");
		dispatcher.forward(request, response);
	
		
	}

	

}
