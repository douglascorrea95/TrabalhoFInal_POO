package br.com.residencia.banco.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import br.com.residencia.banco.contas.ContaPoupanca;

public class EscritaPoupanca {

	final static String PATH_BASICO = "./temp/";
	final static String EXTENSAO = ".txt";

	public static void comprovanteRendimento(ContaPoupanca contaPoupanca, double valor, Integer dias)
			throws IOException {

		String nomeArquivo = "Simulador Rendimento";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO));

		String linha = "";
		linha = "\t\t===========Rendimento============\n";
		buffWrite.append(linha + "\n");

		linha = "ID Cliente: " + contaPoupanca.getIdCliente();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + contaPoupanca.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Número da Conta: " + contaPoupanca.getNumeroConta();
		buffWrite.append(linha + "\n");
	
		linha = "Simulação do Rendimento:\n " + contaPoupanca.calculaRendimentos(valor, dias);
		buffWrite.append(linha + "\n");
		
		linha = "\t\t\n=============FIM==============";
		buffWrite.write(linha);
		buffWrite.close();
	}
}
