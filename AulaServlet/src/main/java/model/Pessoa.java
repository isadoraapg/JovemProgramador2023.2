package model;

public class Pessoa {

	private String nome;
	private String idade;
	private String email;
	
	
	public Pessoa(String nome, String idade, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	
	
	
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
