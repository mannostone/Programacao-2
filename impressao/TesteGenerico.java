package impressao;

public class TesteGenerico {

	public static void main(String[] args) {
		
		// Vetores gen�ricos instanciados
		Integer[] inteiro = {12, 34, 56, 77, 88};
		Double[] real = {12.6, 34.48, 56.62, 77.15, 88.145};
		String[] nome = {"Cruz", "Credo", "Valdo", "Silva", "Santos"};
		
		// Objeto gen�rico
		impressaoGenerica impGen = new impressaoGenerica();
		
		// Chamada ao m�todo gen�rico
		// impGen.imprimeVetor(real);
		// impGen.imprimeVetor(inteiro);
		// impGen.imprimeVetor(nome);
		
		// troca de valores gen�ricos
		impGen.troca(real,0,1);
		impGen.imprimeVetor(real);
		
		
		// sele��o do maior e menor de forma din�mica
		impGen.maiorMenor(inteiro);
	}

}
