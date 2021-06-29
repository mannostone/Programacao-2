package aula06_CRUD;

import modelo.produto;
import modelo.produtoDAO;

public class testCRUD {
	public static void main (String [] args) {
		// objeto do tipo produto
		produto p1 = new produto();
		// Inserção de valores via set
		p1.setCodigo(1010);
		p1.setDescricao("Batedeira");
		p1.setQuantidade(120);
		p1.setPreco(130.50);
		p1.setFabricante("Phillips");
		
		// cria um objeto do tipo que faz alterações no banco
		produtoDAO dao = new produtoDAO();
		// executa a função que adiciona os valores digitados ao banco
		dao.adiciona(p1);
		
	}
}
