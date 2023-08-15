package Ex_4.controler;

public class Metodo_4 {

	public Metodo_4() {
		super();
	}
	
	public int fatorialDuplo(int numero) {
		if(numero == 1) {
			return 1;
		}else {
			if((numero % 2) != 0) {
				return numero * fatorialDuplo(numero - 1);
			}else {
				return fatorialDuplo(numero - 1);
			}
		}
	}

}
