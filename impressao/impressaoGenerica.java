package impressao;

public class impressaoGenerica {
	// Função que irá exibir os valores independente de seu tipo
	public <T> void imprimeVetor(T[] vetor) {
		for (T t : vetor) {
			System.out.println(t); 
		}
	} // Fim da função imprimeVetor
	
	//Troca de posição dinâmica
	public <T> void troca(T[] vetor, int pos1, int pos2) {
		// variável auxiliar na troca de posições recebe a posição 1
		T aux = vetor[pos1];
		// a primeira posição recebe a segunda
		vetor[pos1] = vetor[pos2];
		// a segunda recebe o armazenado em aux
		vetor[pos2] = aux;
	} // Fim da função troca
	
	//  Comparativo para vetores dinâmicos
	public <T extends Comparable> void maiorMenor(T[] vetor) {
		T maior = vetor[0];
		T menor = vetor[0];
		
		for (T elemento : vetor) {
			if(maior.compareTo(elemento) < 0) {
				maior = elemento; }
			if(menor.compareTo(elemento) > 0) {
				menor = elemento; }
		} // fim do laço for
	
	System.out.println("Maior: " + maior);
	System.out.println("Menor: " + menor);
	} // Fim da função maiorMenor
	
	/* compareTo(x) retorna 1 se valor for maior
	 * 				retorna 0 se valor for igual
	 * 				retorna -1 se valor for menor */
}

