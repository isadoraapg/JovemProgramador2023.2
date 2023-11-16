package senac.jp.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import senac.jp.db.AlunoJDBCdao;
import senac.jp.dominio.Aluno;

@WebServlet("/ConfirmarCadastroServlet")
public class ConfirmarCadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("------------- Passei no servlet de confirmar cadastro ------------");
		

		
		AlunoJDBCdao dao = new AlunoJDBCdao();
		Aluno aluno = new Aluno();	
		
		String idade = request.getParameter("idade");
		String semestre = request.getParameter("semestre");
		
		
		aluno.setNome(request.getParameter("nome"));
		aluno.setIdade(idade);
		aluno.setSemestre(semestre);
		aluno.setGenero(request.getParameter("genero"));
		String matricula = criarMatricula(idade,semestre);
		aluno.setMatricula(matricula);
		int id = dao.cadastrarAluno(aluno);	
		aluno.setId(id);
		request.setAttribute("aluno", aluno);		
		
		
		// Encaminhar a requisição para o JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("detalharAluno.jsp");
		dispatcher.forward(request, response);

	}
	
	
	private String criarMatricula(String idade, String semestre) {
		
		
		
		LocalDate dataAtual = LocalDate.now();
		int mes = dataAtual.getMonthValue();
		int ano = dataAtual.getYear();
		// Assume que o semestre 1 é de Janeiro a Junho e o semestre 2 é de Julho a Dezembro
		int semestreEscolha = (mes < 7) ? 1 : 2;
		
		Random random = new Random();		
		String matricula = String.valueOf(ano) + String.valueOf(mes) + String.valueOf(semestreEscolha) + String.valueOf(idade);
		
        // Gera quatro números aleatórios entre 0 e 9
        for (int i = 0; i < 4; i++) {
        	matricula += String.valueOf(random.nextInt(10)); 
        }
       
    
		return matricula;    
	}

}
