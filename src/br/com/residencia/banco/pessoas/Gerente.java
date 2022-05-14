package br.com.residencia.banco.pessoas;

import br.com.residencia.banco.agencias.Agencia;
import br.com.residencia.banco.enums.TipoPessoa;

public class Gerente extends Funcionario {

	// ATRIBUTOS
	private Integer idGerente;
	private String senha;
	private TipoPessoa tipoPessoa;
	
	
	// GETTERS AND SETTERS
	public Integer getIdGerente() {
		return idGerente;
	}

	public String getSenha() {
		return senha;
	}

//	public void setSenha(String senha) {
//		this.senha = senha;
//	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	//CONTSRUTOR
//	public Gerente() {
//		super();
//	}

	public Gerente(String nome, String cpf, String endereco, String telefone, Integer idFuncionario, Double salario,
			String cargo, Integer idGerente, String senha, TipoPessoa tipoPessoa) {
		super(nome, cpf, endereco, telefone, idFuncionario, salario, cargo);
		this.idGerente = idGerente;
		this.senha = senha;
		this.tipoPessoa = tipoPessoa;
	}
}
