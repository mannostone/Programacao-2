package Aula03;

public class testaProdutoGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		produtoGenerico<String> p1 = new produtoGenerico("ABC13JHQ", "Teclado", 900);
		produtoGenerico<Double> p2 = new produtoGenerico("123.45", "Mouse", 100);
		// Será exibido o toString gerado na classe produtoGenerico
		System.out.println(p2);
		
	}

}
