package impressao;

public class TesteGenerico {

	public static void main(String[] args) {
		
		// Vetores genéricos instanciados
		Integer[] inteiro = {12, 34, 56, 77, 88};
		Double[] real = {12.6, 34.48, 56.62, 77.15, 88.145};
		String[] nome = {"Cruz", "Credo", "Valdo", "Silva", "Santos"};
		
		// Objeto genérico
		impressaoGenerica impGen = new impressaoGenerica();
		
		// Chamada ao método genérico
		// impGen.imprimeVetor(real);
		// impGen.imprimeVetor(inteiro);
		// impGen.imprimeVetor(nome);
		
		// troca de valores genéricos
		impGen.troca(real,0,1);
		impGen.imprimeVetor(real);
		
		
		// seleção do maior e menor de forma dinâmica
		impGen.maiorMenor(inteiro);
	}

}
