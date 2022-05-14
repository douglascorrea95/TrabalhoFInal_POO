package br.com.residencia.banco.contas;

import br.com.residencia.banco.enums.TipoConta;
import br.com.residencia.banco.pessoas.Cliente;

public abstract class Conta {

	private Integer idConta;
	private TipoConta tipoConta;
	private String numeroAgencia;
	private String numeroConta;
	private Double saldo;
//	private static int totalDeContas;
//	private static final double TAXA_SAQUE =  0.1;
//	private static final double TAXA_DEPOSITO = 0.1;
//	private static final double TAXA_TRANSFERENCIA = 0.2;

	// GETTERS AND SETTERS

	public Integer getIdConta() {
		return idConta;
	}
	
	public TipoConta getTipoConta() {
		return tipoConta;
	}
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	

	public  Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldoNovo) {
		this.saldo = saldoNovo;
	}

	
//	public static double getTaxaSaque() {
//		return TAXA_SAQUE;
//	}
//
//	public static double getTaxaDeposito() {
//		return TAXA_DEPOSITO;
//	}
//
//	public static double getTaxaTransferencia() {
//		return TAXA_TRANSFERENCIA;
//	}
//
//	
//	public static int getTotalDeContas() {
//		return totalDeContas;
//	}
//
//	public void setTotalDeContas(Integer totalDeContas) {
//		this.totalDeContas = totalDeContas;
//	}

	
//	Métodos 

//	public abstract boolean sacar(double valor);
//
//	//PARA TRASNFERÊNCIA
//	public void depositarPorTransferencia(double valor, Conta contaDestino) {
//		System.out.printf("Valor Depositado: %.2f " , valor);
//		double novoSaldo = contaDestino.getSaldo() + valor;
//		contaDestino.saldo = novoSaldo;
//	}
//
//	public abstract void depositar(double valor);
//	
//
//	public abstract boolean transferir(double valor, Conta contaDestino);

	

	// CONSTRUTOR

	public Conta(Integer idConta, TipoConta tipoConta,  String numeroAgencia, String numeroConta, Double saldo) {
		super();
		this.idConta = idConta;
		this.tipoConta = tipoConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}



}
