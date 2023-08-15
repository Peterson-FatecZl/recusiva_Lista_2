package Ex_5.controler;

public class Metodo_5 {

	public Metodo_5() {
		super();
	}
	
	public int MDC(int numero, int numero_2) {
		if(numero_2 > numero) {
			int resto = (numero_2 % numero);
			
			if(resto == 0) {
				return numero;
			}else {
				return MDC(numero, resto);
			}
		}else {
			int resto = (numero % numero_2);
			
			if (resto == 0) {
				return numero_2;
			}else {
				return MDC(numero_2, resto);
			}
		}
		
	}

}
