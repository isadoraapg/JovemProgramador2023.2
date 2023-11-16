package model;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Produto {
	
	
	private String nome;
	private int quantidade;
	private List<Integer> historicoSaida;
	private List<Integer> historicoEntrada;
	private List<Date> dataEntrada;
	private List<Date> dataSaida;
	
	
	public Produto(String nome, int quantidade) {
		
		this.nome = nome;
		this.quantidade = quantidade;
		this.historicoSaida = new ArrayList<>();
		this.historicoEntrada = new ArrayList<>();
		this.dataEntrada = new ArrayList<>();
		this.dataSaida = new ArrayList<>();
	}


	public String getNome() {
		return nome;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public List<Integer> getHistoricoSaida() {
		return historicoSaida;
	}


	public List<Integer> getHistoricoEntrada() {
		return historicoEntrada;
	}


	public List<Date> getDataEntrada() {
		return dataEntrada;
	}


	public List<Date> getDataSaida() {
		return dataSaida;
	}
	
	
	
	
	
	
	
	
	
	public void adicionarQuantidade (int quantidade) {
		this.quantidade += quantidade;
		
	}
	
	public void removerQuantidade (int quantidade) {
		if(this.quantidade >= quantidade) {
		this.quantidade -= quantidade;
		}
		
	}
	
	
	public void addHistoricoEntrada (int quantidade) {
		historicoEntrada.add(quantidade);
		dataEntrada.add(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
	}
	
	public void addHistoricoSaida (int quantidade) {
		historicoSaida.add(quantidade);
		dataSaida.add(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
	}
	
	
	
	
	

}
