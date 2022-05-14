package br.com.residencia.banco.pessoas;

public class Funcionario extends Pessoa {
	
	private Integer idFuncionario;
	private Double salario;
	private String cargo;
	
	// GETTERS AND SETTERS
	
	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	//CONTSRUTOR
	public Funcionario(String nome, String cpf, String endereco, String telefone, Integer idFuncionario, Double salario,
			String cargo) {
		super(nome, cpf, endereco, telefone);
		this.idFuncionario = idFuncionario;
		this.salario = salario;
		this.cargo = cargo;
	}
}
