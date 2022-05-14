package br.com.residencia.banco.contas;

import br.com.residencia.banco.enums.TipoConta;

import br.com.residencia.banco.pessoas.Cliente;
import br.com.residencia.banco.io.Leitura;
import br.com.residencia.banco.menus.MenuConta;

public class ContaPoupanca extends Conta {
	
	private Integer idContaPoupanca;
	private Integer idCliente;
	
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaPoupanca() {
		return idContaPoupanca;
	}
	
	public Integer getIdCliente() {
		return this.idCliente;
	}

	//CONSTRUTOR
	public ContaPoupanca(Integer idConta, TipoConta tipoConta, String numeroAgencia, String numeroConta, Double saldo,
			Integer idContaPoupanca, Integer idCliente) {
		super(idConta, tipoConta, numeroAgencia, numeroConta, saldo);
		this.idContaPoupanca = idContaPoupanca;
		this.idCliente = idCliente;
	}

	//METODOS
	
	public static void sacar(double valor, Integer idLogado) {
		for(int j = 0; j < Leitura.getContasPoupanca().size(); j++) {
			if(Leitura.getContasPoupanca().get(j).getIdCliente() == idLogado) {
				if (Leitura.getContasPoupanca().get(j).getSaldo() < valor) {
					System.out.println("\nImpossível realizar saque\n");
					MenuConta.menuOpcoes();	
				} else {
					double novoSaldo = Leitura.getContasPoupanca().get(j).getSaldo() - valor;
					Leitura.getContasPoupanca().get(j).setSaldo(novoSaldo);
					System.out.println("\nSaque de R$" + valor + " realizado com sucesso!\n");
					MenuConta.menuOpcoes();
					}
				}
			}
		}
	
	public static void depositar(double valor, Integer idLogado) {
		for(int j = 0; j < Leitura.getContasPoupanca().size(); j++) {
			if(Leitura.getContasPoupanca().get(j).getIdCliente() == idLogado) {
				double novoSaldo = Leitura.getContasPoupanca().get(j).getSaldo() + valor;
				Leitura.getContasPoupanca().get(j).setSaldo(novoSaldo);
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
				
		for(int j = 0; j < Leitura.getContasPoupanca().size(); j++) {
			if(Leitura.getContasPoupanca().get(j).getIdCliente() == idLogado) {
				if (Leitura.getContasPoupanca().get(j).getSaldo() >= valor + 0.20) {
					contaOrigem = j;
					teste2 = true;	
				}
			}	
		}
			
		for(int k = 0; k < Leitura.getContasPoupanca().size(); k++) {	
			if(Leitura.getContasPoupanca().get(k).getNumeroConta().equals(numContaDestino)) {
				contaDestinoArray = k;
				teste = true;				
				}
		}
		
		
		if(teste == true && teste2 == true) {						
			double novoSaldo = Leitura.getContasPoupanca().get(contaOrigem).getSaldo() - valor - 0.20;
			Leitura.getContasPoupanca().get(contaOrigem).setSaldo(novoSaldo);
			System.out.println("\nTransferência de R$" + valor + " realizada com sucesso!\n");
			double novoSaldo2 = Leitura.getContasPoupanca().get(contaDestinoArray).getSaldo() + valor;
			Leitura.getContasPoupanca().get(contaDestinoArray).setSaldo(novoSaldo2);
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
//		if (this.saldo < valor || valor < 0) {
//			System.out.println("Não é possível sacar esse valor");
//			return false;
//		} else {
//			System.out.println("Valor Retirado: " + valor);
//			double novoSaldo = this.saldo - valor;
//			this.saldo = novoSaldo;
//			return true;
//		}
//
//	}
//
//	
//	@Override
//	public void depositar(double valor) {
//		if(valor < 0) {
//			System.out.println("Só é possivel fazer depósitos com valores acima de R$0,00");		
//		}else {
//			this .saldo += valor;
//		}
//	}
//			
//	
//	@Override
//	public boolean transferir(double valor, Conta contaDestino) {
//		if (this.saldo > valor) {
//			this.sacar(valor);
//			super.depositarPorTransferencia(valor, contaDestino);
//			return true;
//		} else {
//			System.out.println("Saldo Insuficiente.");
//			return false;
//		}
//	}
	// RENDIMENTO POUPANÇA

	public String calculaRendimentos(double valor, Integer dias) {
		if (dias < 15) {
			return "Rendimentos só podem ser calculados acima de 14 dias.";
		} else {
			double valorFinal = dias * 0.001 * valor;
			return"Valor informado: R$" + valor + " [Seu rendimento será de: R$" + valorFinal + " em " 
					+ dias + " dias.]";
		}

	}
	
}
