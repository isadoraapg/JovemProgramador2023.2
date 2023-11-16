package model;

 

public class Carro {

	private String modelo;

	private boolean disponivel;

	

	public Carro(String modelo) {

		super();

		this.modelo = modelo;

		this.disponivel = true;

	}

 

	public String getModelo() {

		return modelo;

	}

 

	public boolean isDisponivel() {

		return disponivel;

	}

	

	public void alugar() {

		disponivel = false;

	}

	

	public void desvolver() {

		disponivel = true;

	}

}