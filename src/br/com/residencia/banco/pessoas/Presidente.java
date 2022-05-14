package br.com.residencia.banco.pessoas;

import java.util.List;

import br.com.residencia.banco.enums.TipoPessoa;

public class Presidente extends Funcionario {

	// ATRIBUTOS
	private Integer idPresidente;
//	List<Diretor> diretores; //= new ArrayList<>()
	private String senha;
	private TipoPessoa tipoPessoa;

	// GETTERS AND SETTERS
	public Integer getIdPresidente() {
		return idPresidente;
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
	public Presidente(String nome, String cpf, String endereco, String telefone, Integer idFuncionario, Double salario,
			String cargo, Integer idPresidente, String senha, TipoPessoa tipoPessoa) {
		super(nome, cpf, endereco, telefone, idFuncionario, salario, cargo);
		this.idPresidente = idPresidente;
		this.senha = senha;
		this.tipoPessoa = tipoPessoa;
	}

}
