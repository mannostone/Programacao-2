package Colecoes;

import java.util.HashMap;

public class mapa {
	public static void main (String [] args) {
	
		HashMap<Integer, Pessoa> mapaPessoas = new HashMap();
		
		mapaPessoas.put(1001, new Pessoa("Carlos", 24));
		mapaPessoas.put(1002, new Pessoa("Bia", 21));
		mapaPessoas.put(1003, new Pessoa("Rovângela", 70));
		mapaPessoas.put(1004, new Pessoa("Rita", 63));
		
		// trás a tona a chave mencionada
		// System.out.println(mapaPessoas.get(1004));
		
		// identifica as chaves utilizadas
		// System.out.println(mapaPessoas.keySet());
		
		// mostra todos os valores
		// System.out.println(mapaPessoas.values());
		
		// verifica se a chave informada esta vazia
		// System.out.println(mapaPessoas.containsKey(1003));
		
		// verifica se um dado existe no mapa
		// System.out.println(mapaPessoas.containsValue(new Pessoa("Carlos", 24)));
		
		// informa o tamanho do mapa
		// System.out.println(mapaPessoas.size());
	}	
}
