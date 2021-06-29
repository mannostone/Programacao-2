package Exercícios;

import java.util.ArrayList;
import java.util.HashSet;

public class listaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> lista = new ArrayList();
		HashSet<Integer> lista = new HashSet();
		// valor a ser usado como limite no laço
		int total = 300000;
		// currentTimeMillis retorna um valor do tipo long
		long inicioprog = System.currentTimeMillis();
		// variável que vai registrar o tempo de inserção
		long inicioinser = System.currentTimeMillis();
		// laço para a inserção de valores na lista
		for (int i = 0; i <= total; i++) {
			lista.add(i);
		}
		// variável que vai registrar o tempo de inserção
		long fiminser = System.currentTimeMillis();
		// variável que calcula o tempo de inserção
		long tempoinser = fiminser-inicioinser;
		// variável que vai registrar o tempo de busca
		long iniciobusca = System.currentTimeMillis();
		// laço para percorrer a lista
		for (int i = 0; i <= total; i++) {
			lista.contains(i);
		}
		// variável que vai registrar o tempo de busca
		long fimbusca = System.currentTimeMillis();
		// variável que vai calcular o tempo de busca
		long tempobusca = fimbusca - iniciobusca;
		// currentTimeMillis retorna um valor do tipo long
		long fimprog = System.currentTimeMillis();
		// total em milissegundos para a execução do programa
		long tempo = fimprog - inicioprog;
		// exibições
		System.out.println("Tempo gasto: " + tempo);
		System.out.println("Tempo gasto na inserção: " + tempoinser);
		System.out.println("Tempo gasto na busca: " + tempobusca);
		

	}

}
/* 
 *  Crie um código que insira 30 mil números numa ArrayList e pesquise-os.
 *  Vamos usar um método de System para cronometrar o tempo gasto:
 *  Troque a ArrayList por um HashSet e verifique o tempo que vai demorar
 *  Qual foi mais lento?
	• A inserção de 30 mil elementos;
	• Ou as 30 mil buscas?
    Descubra computando o tempo gasto em cada for separadamente
 */