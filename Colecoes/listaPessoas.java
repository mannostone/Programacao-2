package Colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class listaPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pessoa> listaPessoas = new ArrayList();
		
		listaPessoas.add(new Pessoa("Carlos", 18));
		listaPessoas.add(new Pessoa("Maria", 26));
		listaPessoas.add(new Pessoa("Antonio", 63));
		// forEach
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		
		Pessoa p1 = new Pessoa ("a", 1);
		Pessoa p2 = new Pessoa ("a", 1);
		Pessoa p3 = p1;
		
		// comparação de posições de memória ( TERMINAL )
		System.out.println(p1 == p2); // linha 27
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p2)); // linha 25
		
		// Organiza uma lista
		Collections.sort(listaPessoas);
		
		System.out.println(listaPessoas);
	}

}
