package Ex_3.view;
import Ex_3.controler.Metodo_3;

public class Principal_3 {

	public static void main(String[]args) {
		Metodo_3 metodo = new Metodo_3();
		int[] vetor = {1, 5, 4, 6, 8, 9, 7, 4, 2, 52, 5, 330, 11, 72, 88};
		
		System.out.println(metodo.temNumeroParNoVetor(vetor, vetor.length));
	}
}
