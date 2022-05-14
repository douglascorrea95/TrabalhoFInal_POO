package br.com.residencia.banco.menus;

import java.util.Scanner;

import br.com.residencia.banco.logins.Login;
import br.com.residencia.banco.enums.TipoPessoa;
import br.com.residencia.banco.io.Leitura;
import br.com.residencia.banco.menus.MenuConta;
import br.com.residencia.banco.menus.MenuRelatorio;
import br.com.residencia.banco.contas.ContaPoupanca;
import br.com.residencia.banco.contas.ContaCorrente;

public class MenuConta {
	
	static Integer qntSaque = 0;
	static Integer qntDeposito = 0;
	static Integer qntTransferencia = 0;
	static Integer idLogado = null;
		
	public static void login() {
		String cpf;
		String senha;
		Boolean teste = false;		
		String nomeCliente = "";
		String nomeGerente = "";
		String nomeDiretor = "";
		String nomePresidente = "";
		TipoPessoa tipo = null;
				
		Scanner scan = new Scanner(System.in);
		System.out.println("===================================================");
		System.out.println("           G R U P O  3  B A N K I N G             ");
		System.out.println("===================================================");
		System.out.println("CPF: ");
		cpf  = scan.next();
		System.out.println("Senha: ");
		senha = scan.next();			
			
		
		for(int i = 0; i < Leitura.getClientes().size(); i++) {
			if (Leitura.getClientes().get(i).getCpf().equals(cpf) && Leitura.getClientes().get(i).getSenha().equals(senha)) {
				teste = true;
				nomeCliente = Leitura.getClientes().get(i).getNome();
				tipo = Leitura.getClientes().get(i).getTipoPessoa();
				idLogado = Leitura.getClientes().get(i).getIdCliente();
			}
		}
		
		for(int i = 0; i < Leitura.getGerentes().size(); i++) {
			if (Leitura.getGerentes().get(i).getCpf().equals(cpf) && Leitura.getGerentes().get(i).getSenha().equals(senha)) {
				teste = true;
				nomeGerente = Leitura.getGerentes().get(i).getNome();
				tipo = Leitura.getGerentes().get(i).getTipoPessoa();
			}
		}
		
		for(int i = 0; i < Leitura.getDiretores().size(); i++) {
			if (Leitura.getDiretores().get(i).getCpf().equals(cpf) && Leitura.getDiretores().get(i).getSenha().equals(senha)) {
				teste = true;
				nomeDiretor = Leitura.getDiretores().get(i).getNome();
				tipo = Leitura.getDiretores().get(i).getTipoPessoa();
			}
		}
		
		if (Leitura.getPresidente().get(0).getCpf().equals(cpf) && Leitura.getPresidente().get(0).getSenha().equals(senha)) {
			teste = true;
			nomePresidente = Leitura.getPresidente().get(0).getNome();
			tipo = Leitura.getPresidente().get(0).getTipoPessoa();
		}
		
		
		if(teste == true && tipo == TipoPessoa.CLIENTE) {			
			System.out.println("\nOlá, " + nomeCliente);
			MenuConta.menuOpcoes();
		}else if(teste == true) {			
			if(tipo == TipoPessoa.GERENTE) {
				System.out.println("\nOlá, " + nomeGerente);
				MenuRelatorio.relatorio();				
			}else if(tipo == TipoPessoa.DIRETOR) {
				System.out.println("\nOlá, " + nomeDiretor);
				MenuRelatorio.relatorio();
			}else if(tipo == TipoPessoa.PRESIDENTE)	{
				System.out.println("\nOlá, " + nomePresidente);
				MenuRelatorio.relatorio();
			}
		}else {
			System.out.println("\nUsuário Inválido. Tente novamente.\n");
			login();
		}
	}
	
	
	public static void menuOpcoes() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("===================================================");
		System.out.println("          S I S T E M A   B A N C A R I O          ");
		System.out.println("===================================================");
		System.out.println("[1] Movimentação da Conta");
		System.out.println("[2] Relatórios");
		System.out.println("[3] Sair");
		System.out.print("Operação: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("\n");
			System.out.println("===================================================");
			System.out.println("          S I S T E M A   B A N C A R I O          ");
			System.out.println("===================================================");
			System.out.println("[1] Saque");
			System.out.println("[2] Depósito");
			System.out.println("[3] Transferência");
			System.out.println("[4] Voltar");
			System.out.print("Digite a opção desejada: ");
			int oper = sc.nextInt();

			if (oper == 1) {
				qntSaque = qntSaque + 1; //trocar, colocar dentro da operações da conta
				System.out.println("Digite o valor de saque: ");
				Double valor = sc.nextDouble();
				ContaCorrente.sacar(valor, idLogado);
				ContaPoupanca.sacar(valor, idLogado);				
			} else if (oper == 2) {
				qntDeposito = qntDeposito + 1; //trocar, colocar dentro da operações da conta
				System.out.println("Digite o valor do deposito: ");
				Double valor = sc.nextDouble();
				ContaCorrente.depositar(valor, idLogado);
				ContaPoupanca.depositar(valor, idLogado);				
			} else if (oper == 3) {
				qntTransferencia = qntTransferencia + 1; //trocar, colocar dentro da operações da conta
				System.out.println("Digite o valor da transferência: ");
				Double valor = sc.nextDouble();
				System.out.println("Digite o número da conta destino: ");
				String numContaDestino = sc.next();
				ContaCorrente.transferir(valor, idLogado, numContaDestino);
				ContaPoupanca.transferir(valor, idLogado, numContaDestino);
			} else if (oper == 4) {
				System.out.println("\n\n");
				menuOpcoes();
			}
		break;
			
		case 2:
			System.out.println("\n");
			System.out.println("===================================================");
			System.out.println("             R E L A T Ó R I O S                   ");
			System.out.println("===================================================");
			System.out.println("[1] Saldo");
			System.out.println("[2] Tributação da Conta Corrente");
			System.out.println("[3] Rendimento da Poupança");
			System.out.println("[4] Voltar");
			System.out.print("Escolha uma opção: ");
			int rel = sc.nextInt();

			switch (rel) {
			case 1:
				if(idLogado < 7) {
					System.out.println("\nSaldo: R$" + Leitura.getContasCorrente().get(idLogado - 1).getSaldo() + "\n\n");
				}else {
					System.out.println("\nSaldo: R$" + Leitura.getContasPoupanca().get(idLogado - 7).getSaldo() + "\n\n");
				}						
				menuOpcoes();
			break;
			case 2:
				if(qntSaque > 0 && idLogado < 7) {
					System.out.println("\nSaques feitos: " + qntSaque + " Valor debitado: R$" + qntSaque * 0.10);
				}
				if(qntTransferencia > 0 && idLogado < 7) {
					System.out.println("\nTransferências feitas: " + qntTransferencia + " Valor debitado: R$" + qntTransferencia * 0.20);
				}
				if(qntDeposito > 0 && idLogado < 7) {
					System.out.println("\nDepósitos feitos: " + qntDeposito + " Valor debitado: R$" + qntDeposito * 0.10);
				}
				if(idLogado > 7) {
					System.out.println("\nNão há tributações na conta poupança");
				}
				
				
				System.out.println("\n");
				menuOpcoes();
			break;
			case 3:
				// rendimento poupança
			break;
			case 4:
				MenuConta.menuOpcoes();
			break;
			default:
				System.out.println("Opção Inválida!");
				menuOpcoes();
			}

		case 3:
			//fazer o limpa
			System.out.println("Você saiu do Sistema. \n");
			login();
		break;

		default:
			System.out.println("Opção inválida.");
			MenuConta.menuOpcoes();
		}

		sc.close();

	}
}