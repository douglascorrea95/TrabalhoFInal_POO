package br.com.residencia.banco.agencias;

public class Agencia {
	
	private Integer idAgencia;
	private String endereco;
	private String numeroAgencia;
	private Integer idGerente;
	private Integer idDiretor;
	
		//GETTERS AND SETTERS
	
	public Integer getIdAgencia() {
		return idAgencia;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	
	public Integer getIdDiretor() {
		return idDiretor;
	}
	
	public Integer getIdGerente() {
		return idGerente;
	}

		
	//CONSTRUTOR
	public Agencia(Integer idAgencia, String endereco, String numeroAgencia, Integer idGerente, Integer idDiretor) {
		super();
		this.idAgencia = idAgencia;
		this.endereco = endereco;
		this.numeroAgencia = numeroAgencia;
		this.idGerente = idGerente;
		this.idDiretor = idDiretor;
	}

	
}

