package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Produto;

/**
 * Servlet implementation class EstoqueServlet
 */
public class EstoqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private List<Produto> produtos = new ArrayList<>();
    
    public void init() {
    	produtos.add(new Produto("Produto A", 10));
    	produtos.add(new Produto("Produto B", 15));
    	produtos.add(new Produto("Produto C", 30));
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("lista", produtos);
		response.sendRedirect("estoque.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String acao = request.getParameter("acao");
		String nomeProduto = request.getParameter("nomeProduto");
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		
		Produto produtoSelecionado = null;
		
		for (Produto produto: produtos) {
			if (produto.getNome().equals(nomeProduto)) {
				produtoSelecionado = produto;
				break;
			}
		}
		
		if (acao.equals("adicionar")) {
			produtoSelecionado.adicionarQuantidade(quantidade);
			produtoSelecionado.addHistoricoEntrada(quantidade);
		}
		if (acao.equals("remover")) {
			produtoSelecionado.removerQuantidade(quantidade);
			produtoSelecionado.addHistoricoSaida(quantidade);
		}
		
		session.setAttribute("lista", produtos);
		response.sendRedirect("estoque.jsp");
		
		
		
		
	}

}
