package br.com.residencia.banco.pessoas;

import java.util.List;


import br.com.residencia.banco.agencias.Agencia;
import br.com.residencia.banco.enums.TipoPessoa;

public class Diretor extends Funcionario{
	

	// ATRIBUTOS
	private Integer idDiretor;
	private Integer qteAgencias;
//	List<Agencia> agencias; // = new ArrayList<>();
	private String senha;
	private TipoPessoa tipoPessoa;

	// GETTERS AND SETTERS
	public Integer getIdDiretor() {
		return this.idDiretor;
	}

	public Integer getQteAgencias() {
		return this.qteAgencias;
	}

	public void setQteAgencias(Integer qteAgencias) {
		this.qteAgencias = qteAgencias;
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

	//CONSTRUTOR
	public Diretor(String nome, String cpf, String endereco, String telefone, Integer idFuncionario, Double salario,
			String cargo, Integer idDiretor, Integer qteAgencias, String senha, TipoPessoa tipoPessoa) {
		super(nome, cpf, endereco, telefone, idFuncionario, salario, cargo);
		this.idDiretor = idDiretor;
		this.qteAgencias = qteAgencias;
		this.senha = senha;
		this.tipoPessoa = tipoPessoa;
	}	
}
