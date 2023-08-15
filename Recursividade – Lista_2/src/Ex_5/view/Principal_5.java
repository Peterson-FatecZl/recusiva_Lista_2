package Ex_5.view;
import javax.swing.JOptionPane;

import Ex_5.controler.Metodo_5;

public class Principal_5 {

	public static void main(String[] args) {
		Metodo_5 metodo = new Metodo_5();
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número (inteiro e positivo)"));
		int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número (inteiro e positivo)"));

		int resultado = metodo.MDC(numero, segundoNumero);
		JOptionPane.showMessageDialog(null,"O MDC destes Valores é: "+resultado,"Máximo Divisor Comum",JOptionPane.PLAIN_MESSAGE);
	}
}
