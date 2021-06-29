package impressao;

public class impressao {

	// Vetor da classe de inteiros
	public void imprimeVetor(Integer[] vetor) {
		for(Integer inteiro : vetor) {
			System.out.println(inteiro);
		}
	}
	// Vetor da classe de valores reais
	public void imprimeVetor(Double[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i]);
	}
}
	// Vetor da classe de String
	public void imprimeVetor(String[] vetor) {
		for(String string : vetor) {
			System.out.println(string);
		}
	}
}