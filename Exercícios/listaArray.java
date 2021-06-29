package Exerc�cios;

import java.util.ArrayList;
import java.util.HashSet;

public class listaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> lista = new ArrayList();
		HashSet<Integer> lista = new HashSet();
		// valor a ser usado como limite no la�o
		int total = 300000;
		// currentTimeMillis retorna um valor do tipo long
		long inicioprog = System.currentTimeMillis();
		// vari�vel que vai registrar o tempo de inser��o
		long inicioinser = System.currentTimeMillis();
		// la�o para a inser��o de valores na lista
		for (int i = 0; i <= total; i++) {
			lista.add(i);
		}
		// vari�vel que vai registrar o tempo de inser��o
		long fiminser = System.currentTimeMillis();
		// vari�vel que calcula o tempo de inser��o
		long tempoinser = fiminser-inicioinser;
		// vari�vel que vai registrar o tempo de busca
		long iniciobusca = System.currentTimeMillis();
		// la�o para percorrer a lista
		for (int i = 0; i <= total; i++) {
			lista.contains(i);
		}
		// vari�vel que vai registrar o tempo de busca
		long fimbusca = System.currentTimeMillis();
		// vari�vel que vai calcular o tempo de busca
		long tempobusca = fimbusca - iniciobusca;
		// currentTimeMillis retorna um valor do tipo long
		long fimprog = System.currentTimeMillis();
		// total em milissegundos para a execu��o do programa
		long tempo = fimprog - inicioprog;
		// exibi��es
		System.out.println("Tempo gasto: " + tempo);
		System.out.println("Tempo gasto na inser��o: " + tempoinser);
		System.out.println("Tempo gasto na busca: " + tempobusca);
		

	}

}
/* 
 *  Crie um c�digo que insira 30 mil n�meros numa ArrayList e pesquise-os.
 *  Vamos usar um m�todo de System para cronometrar o tempo gasto:
 *  Troque a ArrayList por um HashSet e verifique o tempo que vai demorar
 *  Qual foi mais lento?
	� A inser��o de 30 mil elementos;
	� Ou as 30 mil buscas?
    Descubra computando o tempo gasto em cada for separadamente
 */