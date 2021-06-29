package Colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class minhaLista {
	public static void main (String args[] ) {
		// nova lista de String
		ArrayList<String> listaNomes = new ArrayList();
		
		// dados
		listaNomes.add("Ana");
		listaNomes.add("Manuel");
		listaNomes.add("Carlos");
		listaNomes.add("Silvana");
		listaNomes.add("Andressa");
		
		//String nome equivalente ao "i"
		for(String nome : listaNomes) {
			System.out.println(nome); // nome = posição
		}
	
		System.out.println(); // <br>
		
		//Adição em posição específicca
		listaNomes.add(4, "Roberto");
		
		for(String nome : listaNomes) {
			System.out.println(nome);
		}
		
		// exibição dos objetos com posição
		for (int i = 0; i < listaNomes.size(); i++) {
			System.out.println((i+1) + " " + listaNomes.get(i));
		}
		
		System.out.println();
		
		// remove a primeira ocorrência especificada
		listaNomes.remove("Carlos");
		for (int i = 0; i < listaNomes.size(); i++) {
			System.out.println((i+1) + " " + listaNomes.get(i));
		}
		
		// forma de organizar uma lista (de strings nesse caso)
		Collections.sort(listaNomes);
		// listaNomes.size() == listaNomes.length()
		for (int i = 0; i < listaNomes.size(); i++) {
			System.out.println((i+1) + " " + listaNomes.get(i));
		}
	}
}
