package Ex_1.controler;

public class Metodo {
	
	public Metodo(){
		super();
	}
	
	public int resultadoMultiplicacao2Valores(int valor, int valor2) {
		if(valor2 <= 0) {
			return 0;
			
		}else {
			return valor + resultadoMultiplicacao2Valores(valor, (valor2 -1));
		}
		
	}
	
	
}
