package Ex_2.controler;

public class Metodo_2 {
	
	public Metodo_2() {
		super();
	}
	
	public int restoDivisaoRecursiva(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return dividendo;
		}else {
			return restoDivisaoRecursiva(dividendo - divisor, divisor);
		}
		
	}
	
}
