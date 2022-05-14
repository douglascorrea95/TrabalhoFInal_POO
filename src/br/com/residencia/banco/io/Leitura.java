package br.com.residencia.banco.io;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.residencia.banco.contas.ContaCorrente;
import br.com.residencia.banco.io.Leitura;
import br.com.residencia.banco.pessoas.Cliente;
import br.com.residencia.banco.pessoas.Gerente;
import br.com.residencia.banco.agencias.Agencia;
import br.com.residencia.banco.contas.ContaPoupanca;
import br.com.residencia.banco.pessoas.Diretor;
import br.com.residencia.banco.pessoas.Presidente;
import br.com.residencia.banco.enums.TipoConta;
import br.com.residencia.banco.enums.TipoPessoa;

public class Leitura {
	
	final static String PATH_BASICO = "./temp/";
	final static String EXTENSAO = ".txt";
	
	private static List<Cliente> clientes = new ArrayList<>();
	private static List<Gerente> gerentes = new ArrayList<>();
	private static List<Diretor> diretores = new ArrayList<>();
	private static List<Presidente> presidente = new ArrayList<>();
	
	private static List<Agencia> agencias = new ArrayList<>();
	private static List<ContaCorrente> contasCorrente = new ArrayList<>();
	private static List<ContaPoupanca> contasPoupanca = new ArrayList<>();
		
	public static void leitor(String path) throws IOException {

		List<Cliente> clientesArray = new ArrayList<>();
		List<Gerente> gerentesArray = new ArrayList<>();
		List<Diretor> diretoresArray = new ArrayList<>();
		List<Presidente> presidenteArray = new ArrayList<>();
		
		List<Agencia> agenciasArray = new ArrayList<>();
		List<ContaCorrente> contasCorrenteArray = new ArrayList<>();
		List<ContaPoupanca> contasPoupancaArray = new ArrayList<>();
			 
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
		String linha = "";
		
		try { 
			while (true) {
				linha = buffRead.readLine();
				if (linha != null) {
					String[] vetor = linha.split(";");
					if(vetor[0].equalsIgnoreCase("Cliente")) {
						TipoPessoa tipoPessoa = TipoPessoa.CLIENTE;
						clientesArray.add(new Cliente(vetor[1], vetor[2], vetor[3], vetor[4], Integer.parseInt(vetor[5]), Integer.parseInt(vetor[6]), vetor[7], tipoPessoa));
						setClientes(clientesArray);
					}else if(vetor[0].equalsIgnoreCase("Gerente")){
						TipoPessoa tipoPessoa = TipoPessoa.GERENTE;
						gerentesArray.add(new Gerente(vetor[1], vetor[2], vetor[3], vetor[4], Integer.parseInt(vetor[5]), Double.parseDouble(vetor[6]), vetor[7], Integer.parseInt(vetor[8]), vetor[9], tipoPessoa));
						setGerentes(gerentesArray);						
					}else if(vetor[0].equalsIgnoreCase("Diretor")){
						TipoPessoa tipoPessoa = TipoPessoa.DIRETOR;
						diretoresArray.add(new Diretor(vetor[1], vetor[2], vetor[3], vetor[4], Integer.parseInt(vetor[5]), Double.parseDouble(vetor[6]), vetor[7], Integer.parseInt(vetor[8]), Integer.parseInt(vetor[9]), vetor[10], tipoPessoa));
						setDiretores(diretoresArray);	
					}else if(vetor[0].equalsIgnoreCase("Presidente")){
						TipoPessoa tipoPessoa = TipoPessoa.PRESIDENTE;
						presidenteArray.add(new Presidente(vetor[1], vetor[2], vetor[3], vetor[4], Integer.parseInt(vetor[5]), Double.parseDouble(vetor[6]), vetor[7], Integer.parseInt(vetor[8]), vetor[9], tipoPessoa));
						setPresidente(presidenteArray);
					}else if(vetor[0].equalsIgnoreCase("Agencia")){
						agenciasArray.add(new Agencia(Integer.parseInt(vetor[1]), vetor[2], vetor[3], Integer.parseInt(vetor[4]), Integer.parseInt(vetor[5])));
						setAgencias(agenciasArray);
					}else if(vetor[0].equalsIgnoreCase("ContaCorrente")){
						TipoConta tipoConta = TipoConta.CORRENTE;
						contasCorrenteArray.add(new ContaCorrente(Integer.parseInt(vetor[1]), tipoConta, vetor[3], vetor[4], Double.parseDouble(vetor[5]), Integer.parseInt(vetor[6]), Integer.parseInt(vetor[7])));
						setContasCorrente(contasCorrenteArray);
					}else if(vetor[0].equalsIgnoreCase("ContaPoupanca")){
						TipoConta tipoConta = TipoConta.POUPANCA;
						contasPoupancaArray.add(new ContaPoupanca(Integer.parseInt(vetor[1]), tipoConta, vetor[3], vetor[4], Double.parseDouble(vetor[5]), Integer.parseInt(vetor[6]), Integer.parseInt(vetor[7])));
						setContasPoupanca(contasPoupancaArray);
					}
				} else {
					break;
				}
			}
			buffRead.close();
		}
		catch (FileNotFoundException e) { 
			System.out.println("Arquivo não encontrado no caminho " + PATH_BASICO + path); 
		} 
			
	}

	public static List<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(List<Cliente> clientes) {
		Leitura.clientes = clientes;
	}

	public static List<Gerente> getGerentes() {
		return gerentes;
	}

	public static void setGerentes(List<Gerente> gerentes) {
		Leitura.gerentes = gerentes;
	}
	
	public static List<Diretor> getDiretores() {
		return diretores;
	}

	public static void setDiretores(List<Diretor> diretores) {
		Leitura.diretores = diretores;
	}
		
	public static List<Presidente> getPresidente() {
		return presidente;
	}

	public static void setPresidente(List<Presidente> presidente) {
		Leitura.presidente = presidente;
	}

	public static List<Agencia> getAgencias() {
		return agencias;
	}
	
	public static void setAgencias(List<Agencia> agencias) {
		Leitura.agencias = agencias;
	}
	
	public static List<ContaCorrente> getContasCorrente() {
		return contasCorrente;
	}

	public static void setContasCorrente(List<ContaCorrente> contasCorrente) {
		Leitura.contasCorrente = contasCorrente;
	}
	
	public static List<ContaPoupanca> getContasPoupanca() {
		return contasPoupanca;
	}

	public static void setContasPoupanca(List<ContaPoupanca> contasPoupanca) {
		Leitura.contasPoupanca = contasPoupanca;
	}
}