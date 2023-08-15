package Ex_2.view;
import Ex_2.controler.Metodo_2;
public class Principal_2 {
	public static void main(String[]args) {
		Metodo_2 metodo = new Metodo_2();

		int dividendo = 76, divisor = 7;
		
		System.out.println(metodo.restoDivisaoRecursiva(dividendo, divisor));
	}
}
