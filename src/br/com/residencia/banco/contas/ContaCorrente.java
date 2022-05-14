package br.com.residencia.banco.contas;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.residencia.banco.enums.TipoConta;
import br.com.residencia.banco.menus.MenuConta;
import br.com.residencia.banco.pessoas.Cliente;
import br.com.residencia.banco.io.Leitura;

public class ContaCorrente extends Conta {

	// Atributos
		
	private Integer idContaCorrente;
	private Integer idCliente;
//	private List<Double> taxaTotalDeOperacoes = new ArrayList<>(); 
//	private Map<String, Double> tipoTransacaoValor = new HashMap<>();
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public Integer getIdCliente() {
		return this.idCliente; 
	}
	
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


//	public double getTotalTaxas() {
//		return taxaTotalDeOperacoes.stream().mapToDouble(Double::doubleValue).sum();
//							    
//	}

//	public Map<String, Double> getTipoTransacaoValor() {
//		return tipoTransacaoValor;
//	}
//	

	//CONSTRUTOR
	public ContaCorrente(Integer idConta, TipoConta tipoConta, String numeroAgencia, String numeroConta, Double saldo,
			Integer idContaCorrente, Integer idCliente) {
		super(idConta, tipoConta, numeroAgencia, numeroConta, saldo);
		this.idContaCorrente = idContaCorrente;
		this.idCliente = idCliente;
		
	}
	

		//METODOS
	
	public static void sacar(Double valor, Integer idLogado) {
		for(int j = 0; j < Leitura.getContasCorrente().size(); j++) {
			if(Leitura.getContasCorrente().get(j).getIdCliente() == idLogado) {
				if (Leitura.getContasCorrente().get(j).getSaldo() < (valor+0.10) ) {
					System.out.println("\nImpossível realizar saque\n");
					MenuConta.menuOpcoes();	
				} else {		
					double novoSaldo = Leitura.getContasCorrente().get(j).getSaldo() - valor -0.10;
					Leitura.getContasCorrente().get(j).setSaldo(novoSaldo);
					System.out.println("\nSaque de R$" + valor + " realizado com sucesso!\n");
					MenuConta.menuOpcoes();
	
					}
				}
			}
		}
	
	public static void depositar(Double valor, Integer idLogado) {
		for(int j = 0; j < Leitura.getContasCorrente().size(); j++) {
			if(Leitura.getContasCorrente().get(j).getIdCliente() == idLogado) {
				double novoSaldo = Leitura.getContasCorrente().get(j).getSaldo() + valor - 0.10;
				Leitura.getContasCorrente().get(j).setSaldo(novoSaldo);
				System.out.println("\nDeposito de R$" + valor + " realizado com sucesso!\n");
				MenuConta.menuOpcoes();		
				}
			}
		}
	
	public static void transferir(Double valor, Integer idLogado, String numContaDestino) {
		Integer contaOrigem = null;
		Integer contaDestinoArray = null;
		boolean teste = false;
		boolean teste2 = false;
				
		for(int j = 0; j < Leitura.getContasCorrente().size(); j++) {
			if(Leitura.getContasCorrente().get(j).getIdCliente() == idLogado) {
				if (Leitura.getContasCorrente().get(j).getSaldo() >= (valor + 0.20)) {
					contaOrigem = j;
					teste2 = true;	
				}
			}	
		}
			
		for(int k = 0; k < Leitura.getContasCorrente().size(); k++) {	
			if(Leitura.getContasCorrente().get(k).getNumeroConta().equals(numContaDestino)) {
				contaDestinoArray = k;
				teste = true;				
				}
		}		
		
		if(teste == true && teste2 == true) {						
			double novoSaldo = Leitura.getContasCorrente().get(contaOrigem).getSaldo() - valor - 0.20;
			Leitura.getContasCorrente().get(contaOrigem).setSaldo(novoSaldo);
			System.out.println("\nTransferência de R$" + valor + " realizada com sucesso!\n");
			double novoSaldo2 = Leitura.getContasCorrente().get(contaDestinoArray).getSaldo() + valor;
			Leitura.getContasCorrente().get(contaDestinoArray).setSaldo(novoSaldo2);
			MenuConta.menuOpcoes();		
		}else if(teste == false) {
			System.out.println("\nConta Inexistente\n");
			MenuConta.menuOpcoes();	
		}else {
			System.out.println("\nSaldo Insuficiente\n");
			MenuConta.menuOpcoes();	
		}
	}
	
	
	
	
//	@Override
//	public boolean sacar(double valor) {
//		if (this.saldo < valor || valor == 0) {
//			System.out.println("Não é possível sacar esse valor");
//			return false;
//		} else {
//
//			double novoSaldo = this.saldo - valor - super.getTaxaSaque();
//			this.saldo = novoSaldo;
//			this.taxaTotalDeOperacoes.add(super.getTaxaSaque());
//			this.tipoTransacaoValor.put("Saque", valor);// criei
////			System.out.println("Saque de R$" + valor + " efetuado\n");
////			MenuConta.menuOpcoes();
//			return true;
//		}
//	}

//	
//	@Override
//	public void depositar(double valor) {
//		if (valor < 0) {
//			System.out.println("Só é possivel fazer depósitos com valores acima de R$0,00");
//		} else {
//			this.saldo += valor - super.getTaxaDeposito();
//			this.taxaTotalDeOperacoes.add(super.getTaxaDeposito());
//			this.tipoTransacaoValor.put("Depósito", valor);// criei
//		}
//	}
//
//	@Override
//	public boolean transferir(double valor, Conta contaDestino) {
//		if (this.saldo > valor) {
//			this.sacar(valor); // DESCONTA 0.1
//			this.saldo -= super.getTaxaDeposito(); // DESCONTA 0.1
//			contaDestino.depositarPorTransferencia(valor, contaDestino);
//			this.taxaTotalDeOperacoes.add(super.getTaxaDeposito());
//			this.tipoTransacaoValor.put("Transferência", valor);// criei
//			return true;
//		} else {
//			System.out.println("Saldo Insuficiente.");
//			return false;
//		}
//	}

}
