package Colecoes;

import java.util.HashSet;
import java.util.Iterator;

public class Conjuntos {
	public static void main (String [] args) {
		// com HastSet é impossível duplicar valores
		HashSet<String> conjuntoNomes = new HashSet();
		
		conjuntoNomes.add("Ana");
		conjuntoNomes.add("Bia");
		conjuntoNomes.add("Carla");
		conjuntoNomes.add("Denise");
		conjuntoNomes.add("Elaine");
		
		// função que consegue organizar os conjuntos
		/* Iterator<String> iterator = conjuntoNomes.iterator();
		
		while (iterator.hasNext()) {
			String nome = iterator.next();
			System.out.println(nome);
		} */
		for (String nomes : conjuntoNomes) {
			System.out.println(nomes);
		 }
	}
}
