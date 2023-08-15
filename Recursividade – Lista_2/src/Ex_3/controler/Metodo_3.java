package Ex_3.controler;

public class Metodo_3 {
	public Metodo_3(){
		super();
	}
	
	public int temNumeroParNoVetor(int[] vetor, int tamanho) {
		if(tamanho == 0) {
			return 0;
		}else {
			int valorUltimaPosicao = vetor[tamanho - 1];
			if(valorUltimaPosicao % 2 == 0) {
				return 1 + temNumeroParNoVetor(vetor, tamanho-1);
			}else{
				return temNumeroParNoVetor(vetor, tamanho-1);
			}
		}
	}
}
