package br.com.residencia.banco.menus;

import java.util.Scanner;

public class MenuRelatorio {
		
	public static void relatorio() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================");
		System.out.println("        S I S T E M A   I N T E R N O              ");
		System.out.println("===================================================");
		System.out.println("[1] Relat�rio de n�mero de contas da ag�ncia.");
		System.out.println("[2] Relat�rio de todos os clientes do sistema.");
		System.out.println("[3] Relat�rio com o valor total armazenado no banco");
		System.out.println("[4] Sair");
		System.out.print("Digite a op��o desejada:");
		int relatorio = sc.nextInt();
		
		switch (relatorio) {
		case 1: 
			System.out.println("Gerente");
			break;
		case 2:
			System.out.println("Diretor");
			break;
		case 3:
			System.out.println("Presidente");
		case 4: 
			System.out.println("Chamar menu inicial");// chamar menu inicial
			break;
		
		default:
			System.out.println("Op��o Inv�lida!");
		}
		
	}
}


