package br.com.residencia.banco.pessoas;

import java.util.Date;

public class Pessoa {
	
	//Atributos 
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;

		
	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	//CONSTRUTOR
	public Pessoa(String nome, String cpf, String endereco, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
}
