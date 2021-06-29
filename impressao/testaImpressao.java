package impressao;

public class testaImpressao {

	public static void main(String[] args) {	
		
		impressao imp = new impressao();
		Integer[] inteiro = {12, 34, 56, 77, 88};
		Double[] real = {12.6, 34.48, 56.62, 77.15, 88.145};
		String[] nome = {"Cruz", "Credo", "Valdo", "Silva", "Santos"};
		
		imp.imprimeVetor(real);
		imp.imprimeVetor(inteiro);
		imp.imprimeVetor(nome);
		

	}

}
