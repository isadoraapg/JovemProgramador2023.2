package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class MeuPrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MeuPrimeiroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private String gerarSaudacao(String nome) {
    	return "Olá, " + nome + "!";
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getContextPath();
		int numero = 15;
		String[] pessoas = {"João", "Maria", "Fábio"};
		String nome = "Fulano";
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2> Olá, Mundo!</h2>");
		out.println("<h3>Nome do projeto: " + path + "</h3>");
		out.println("Número: " + numero);
		
		out.println("Pessoas: ");
		out.println("<ul>");
		for (String pessoa : pessoas) {
			out.println("<li>" + pessoa + "</li>");
			out.println("<br>");
		}
		
		
		out.println("</ul>");
		out.println("<p>" + gerarSaudacao(nome) + "</p>");
		out.println("</body></html>");
		
		
		
		
		
		
		
	}	
}
