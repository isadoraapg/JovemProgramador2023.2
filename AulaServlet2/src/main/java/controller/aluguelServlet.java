package controller;

 

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Carro;

 

/**
* Servlet implementation class AluguelServlet
*/
public class aluguelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Carro> carros = new ArrayList<>();

	public void init() throws ServletException {
		carros.add(new Carro("Carro A"));
		carros.add(new Carro("Carro B"));
		carros.add(new Carro("Carro C"));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("carros", carros);
		request.getRequestDispatcher("aluguelCarro.jsp").forward(request, response);
	}

 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String acao = request.getParameter("acao");
		String modelo = request.getParameter("modelo");

		Carro carroSelecionado = null;

		for(Carro carro : carros) {
			if(carro.getModelo().equals(modelo)) {
				carroSelecionado = carro;
				break;
			}
		}


		if (carroSelecionado != null) {
			if(acao.equals("alugar")) {
				carroSelecionado.alugar();
			} else if (acao.equals("devolver")) {
				carroSelecionado.desvolver();
			}
		}

		request.setAttribute("carros", carros);
		request.setAttribute("mensagem", "Operação realizada com sucesso");
		request.getRequestDispatcher("aluguelCarro.jsp").forward(request, response);

	}

 

}
