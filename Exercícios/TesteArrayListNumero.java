package Exercícios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; // Scanner para a inserção de valores

public class TesteArrayListNumero {
	// • Crie uma classe TesteArrayListNumero que possui um método main.
	public static void main (String [] args) { 
		Scanner sc = new Scanner (System.in); // Scanner
		// • Dentro do main crie um ArrayList de Integer.
		ArrayList<Integer> lista = new ArrayList(); 
		// laço para a inserção de valores na lista
		for(int i = 0; i < 10; i++) { 
			// • Adicione 10 números informados pelo usuário.
			System.out.println("Digite um valor: ");			
			lista.add(sc.nextInt()); 
		}
		// Percorra a lista imprimindo o valor do número inteiro de cada objeto
		for (Integer indice : lista) { 
			System.out.println(indice);
		} 
		
		System.out.print("\n\n");
		// • Ordene os objetos contidos na lista.
		Collections.sort(lista); 
		// Collections.shuffle(lista); // random
		// • Percorra a lista imprimindo o valor de cada objeto.
		System.out.println(lista); 
		
	}
}
/*
• Crie uma classe TesteArrayListNumero que possui um método main.
• Dentro do main crie um ArrayList de Integer.
• Adicione 10 números informados pelo usuário.
• Percorra a lista imprimindo o valor do número inteiro de cada objeto.
• Ordene os objetos contidos na lista.
• Percorra a lista imprimindo o valor de cada objeto
*/