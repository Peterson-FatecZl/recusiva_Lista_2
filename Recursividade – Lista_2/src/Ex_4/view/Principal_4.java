package Ex_4.view;
import Ex_4.controler.Metodo_4;
import javax.swing.JOptionPane;

public class Principal_4 {

	public static void main(String[] args) {
		Metodo_4 metodo = new Metodo_4();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número (inteiro, positivo e ímpar)"));

		if((numero % 2) != 0) {
			System.out.println(metodo.fatorialDuplo(numero));	
		}else {
			JOptionPane.showMessageDialog(null,"Valor Inválido!","ERRO",JOptionPane.ERROR_MESSAGE);
		}
		
	}
}