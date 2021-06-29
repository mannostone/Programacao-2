package Exercícios;

// import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class listaDeProdutos {
	public static void main (String [] args) {
		// Scanner sc = new Scanner (System.in);
		
		ArrayList<Produto> listaProdutos = new ArrayList(); // • Dentro do main crie um ArrayList de Produto.
		
		// Teste com inserção via Scanner - FALHA
		/* Produto aux = new Produto();
		
		 for (int i = 0; i < 3; i++) {
			System.out.println("Digite um código: ");
			aux.setCodigo(sc.nextInt());
			System.out.println("Digite uma descrição para o produto: ");
			aux.setDescricao(sc.next());
			System.out.println("Quantidade do produto: ");
			aux.setQuantidade(sc.nextInt());
			System.out.println("Digite o valor desse produto: ");
			aux.setValor(sc.nextFloat());
			System.out.print("\n\n");
			
			listaProdutos.add(new Produto()); // ????????????
		} */
		
		// Inserção de valores com o construtor
		// • Adicione 10 produtos quaisquer.
		listaProdutos.add(new Produto (1, "Garrafa", 1, 10.00));
		listaProdutos.add(new Produto (2, "Monitor", 1, 299.99));
		listaProdutos.add(new Produto (3, "Porta-Retrato", 1, 15.00));
		listaProdutos.add(new Produto (4, "Processador", 1, 405.37));
		listaProdutos.add(new Produto (5, "Memória-Ram", 2, 275.00));
		listaProdutos.add(new Produto (6, "Pasta Térmica", 1, 39.90));
		listaProdutos.add(new Produto (7, "SSD NvME 512Gb", 1, 300.00));
		listaProdutos.add(new Produto (8, "Cooler Hoopson", 5, 30.00));
		listaProdutos.add(new Produto (9, "Placa-Mãe", 1, 390.00));
		listaProdutos.add(new Produto (10, "Placa de Video", 1, 396.65));
		 
		// • Percorra a lista imprimindo a descrição de cada produto.
		for (Produto indice : listaProdutos) System.out.println(indice.getDescricao());
		// quebra de linha
		System.out.print("\n\n");
		// • Ordene os objetos contidos na lista na ordem crescente baseando-se em seu valor.
		Collections.sort(listaProdutos);
		// • Percorra a lista imprimindo o valor de cada objeto.
		for (Produto indice : listaProdutos) System.out.println(indice.getValor());
		// opcional
		for (Produto indice : listaProdutos) System.out.println(indice);
	}
}