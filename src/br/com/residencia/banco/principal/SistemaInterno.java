package br.com.residencia.banco.principal;

import java.io.IOException;
import br.com.residencia.banco.menus.MenuConta;
import br.com.residencia.banco.io.Leitura;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
						
	
		Leitura.leitor("arquivo.txt");
		MenuConta.login();
		

	}
}
