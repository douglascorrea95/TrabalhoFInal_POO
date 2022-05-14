package br.com.residencia.banco.pessoas;

import br.com.residencia.banco.enums.TipoPessoa;

public class Cliente extends Pessoa {

	// ATRIBUTOS
	private Integer idCliente;
	private Integer idGerente;
	private String senha;
	private TipoPessoa tipoPessoa;

	// GETTERS AND SETTERS
	public Integer getIdCliente() {
		return idCliente;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}	

	public String getSenha() {
		return senha;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	//CONSTRUTOR

	public Cliente(String nome, String cpf, String endereco, String telefone, Integer idCliente, Integer idGerente,
			String senha, TipoPessoa tipoPessoa) {
		super(nome, cpf, endereco, telefone);
		this.idCliente = idCliente;
		this.idGerente = idGerente;
		this.senha = senha;
		this.tipoPessoa = tipoPessoa;
	}
	
}
