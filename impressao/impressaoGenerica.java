package impressao;

public class impressaoGenerica {
	// Fun��o que ir� exibir os valores independente de seu tipo
	public <T> void imprimeVetor(T[] vetor) {
		for (T t : vetor) {
			System.out.println(t); 
		}
	} // Fim da fun��o imprimeVetor
	
	//Troca de posi��o din�mica
	public <T> void troca(T[] vetor, int pos1, int pos2) {
		// vari�vel auxiliar na troca de posi��es recebe a posi��o 1
		T aux = vetor[pos1];
		// a primeira posi��o recebe a segunda
		vetor[pos1] = vetor[pos2];
		// a segunda recebe o armazenado em aux
		vetor[pos2] = aux;
	} // Fim da fun��o troca
	
	//  Comparativo para vetores din�micos
	public <T extends Comparable> void maiorMenor(T[] vetor) {
		T maior = vetor[0];
		T menor = vetor[0];
		
		for (T elemento : vetor) {
			if(maior.compareTo(elemento) < 0) {
				maior = elemento; }
			if(menor.compareTo(elemento) > 0) {
				menor = elemento; }
		} // fim do la�o for
	
	System.out.println("Maior: " + maior);
	System.out.println("Menor: " + menor);
	} // Fim da fun��o maiorMenor
	
	/* compareTo(x) retorna 1 se valor for maior
	 * 				retorna 0 se valor for igual
	 * 				retorna -1 se valor for menor */
}

