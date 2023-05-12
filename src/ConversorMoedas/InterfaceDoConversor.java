package ConversorMoedas;

import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class InterfaceDoConversor {
	//RealP/OutraMoeda ValorRequirdo / valorMoeda; MoedaP/Real ValorMoeda * valorRequerido

	public static void main(String[] args) {
			
		JOptionPane.showMessageDialog(null, "Bem-vindo ao conversor de moedas");
		
		String[] escolhas = {"Real para Dollar", "Dollar para Real", "Real para Euro", "Euro para Real", 
				"Real para Libras Esterlinas", "Libras Esterlinas para Real", "Real para Peso Argentino", 
				"Peso Argentino para Real", "Real para Peso Chileno", "Peso Chileno para Real"};
		
	    
	     
	    String tipoConvercao =  (String) JOptionPane.showInputDialog(null, "Escolha o tipo de conversão: ", "Moeda", 
	    		 JOptionPane.PLAIN_MESSAGE, null, escolhas, 0); 
	    
	    
	    String valorDinheiro = JOptionPane.showInputDialog("Qual o valor a ser convertido? ", "Digite o valor");
		/* Colocado o try para caso não for digitado número, entrar uma caixa diálogo avisando que somente
	    números são aceitos */
		try { int valor = Integer.parseInt(valorDinheiro); }
		catch (NumberFormatException valor) {
			JOptionPane.showMessageDialog(null, "É necessário digitar somente números.");
			System.exit(0);
		}
	    
	    
	    
	    int valorDinheiroEmInt = Integer.parseInt(valorDinheiro);
	    DecimalFormat df = new DecimalFormat("#,###.00");
	    //De acordo com o tipo de conversão será feito o calcúlo para a conversão
	     if(tipoConvercao == "Real para Dollar") {
	    	 
	    	 double valorMoeda = 5.15;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " US$");
	    	
	     } else if (tipoConvercao == "Dollar para Real") {
	    	 double valorMoeda = 5.15;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " R$");
	     } else if (tipoConvercao == "Euro para Real") {
	    	 double valorMoeda = 5.56;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " R$");
	    	 
	     } else if(tipoConvercao == "Real para Euro") {
	    	 double valorMoeda = 5.56;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " €");
	     } else if (tipoConvercao == "Real para Libras Esterlinas") {
	    	 double valorMoeda = 6.28;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " £");
	     } else if(tipoConvercao == "Libras Esterlinas para Real") {
	    	 double valorMoeda = 6.28;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " R$");
	     } else if (tipoConvercao == "Real para Peso Argentino") {
	    	 double valorMoeda = 0.028;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " ARS$");
	     } else if(tipoConvercao == "Peso Argentino para Real") {
	    	 double valorMoeda = 0.028;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " R$");
	     } else if(tipoConvercao == "Real para Peso Chileno") {
	    	 double valorMoeda = 0.0062;
	    	 double conta = valorDinheiroEmInt / valorMoeda;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " CLP$");
	     } else if(tipoConvercao == "Peso Chileno para Real") {
	    	 double valorMoeda = 0.0062;
	    	 double conta = valorMoeda * valorDinheiroEmInt;
	    	 String contaFormatada = df.format(conta);
	    	 JOptionPane.showMessageDialog(null, "O valor da conversão é " + contaFormatada + " R$");
	     }

	}

}

