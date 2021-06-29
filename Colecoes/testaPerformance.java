package Colecoes;

import java.util.ArrayList;
import java.util.HashSet;

public class testaPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList<Integer> lista = new ArrayList();
		 HashSet<Integer> lista = new HashSet();
		int total = 300000;
		// tempo em milissegundos
		long inicio = System.currentTimeMillis();
		// adiciona valores a lista
		for (int i = 0; i <= total; i++) {
			lista.add(i);
		}
		// percorre a lista
		for (int i = 0; i <= total; i++) {
			lista.contains(i);
		}
		long fim = System.currentTimeMillis();
		
		long tempo = fim - inicio;
		
		System.out.println("Tempo gasto: " + tempo + "ms");

		
	}

}
