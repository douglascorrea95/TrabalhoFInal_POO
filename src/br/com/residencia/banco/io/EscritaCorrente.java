package br.com.residencia.banco.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;

import br.com.residencia.banco.contas.ContaCorrente;

public class EscritaCorrente {
	
	final static String PATH_BASICO = "./temp/";
    final static String EXTENSAO = ".txt";
    
//    	public static void comprovanteTransacoes(ContaCorrente contaCorrente) throws IOException {
//
//        String nomeArquivo = "Relat�rio de tributa��o";
//        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO));
//        
//        String linha ="";
//        linha = "\t\t\n===========Transa��es============\n";
//        for (Entry<String, Double> entry : contaCorrente.getTipoTransacaoValor().entrySet()) {
//        	linha+=String.format("""
//        			ID Cliente: %s
//        			Ag�ncia: %s
//        			Conta: %s
//        			Tipo Transa��o: %s
//        			Valor: %.2f
//        			""",contaCorrente.getIdCliente(),contaCorrente.getNumeroAgencia(),contaCorrente.getNumeroConta()
//        				,entry.getKey(),entry.getValue());
//	    }
//        linha += "Total tarifas: R$ " + contaCorrente.getTotalTaxas();
//        linha +=String.format("\nSaldo Final: R$ %.2f " , contaCorrente.getSaldo()); 
//        linha += "\t\t\n============FIM============";
//        buffWrite.write(linha);
//        buffWrite.close();
//               	
//    	}
        	       		
//        		linha = "ID Cliente: " + contaCorrente.getIdCliente();
//                buffWrite.append(linha + "\n");
//                
//                linha = "Ag�ncia: " + contaCorrente.getNumeroAgencia();
//                buffWrite.append(linha + "\n");
//                
//                linha = "Conta: " + contaCorrente.getNumeroConta();
//                buffWrite.append(linha + "\n");
//                
//                linha = "Tipo Transa��o" + key;
//                buffWrite.append(linha + "\n");
//                 
//                linha = "Valor" + value;
//                buffWrite.append(linha + "\n");
			
        	 
             
          //linha += "Total tarifas: R$" + contaCorrente.getTotalTaxas();
          //buffWrite.write(linha);

       
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date date = new Date();
//        //linha = "Opera��o realizada em: " + simpleDateFormat(date);
//        buffWrite.append(linha + "\n");
//        
//        linha = "=========== FIM ===========";
//        buffWrite.append(linha + "\n");
        
        
       // buffWrite.append(linha);
       

		
    
    

	

}
