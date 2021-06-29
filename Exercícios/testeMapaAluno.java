package Exerc�cios;

import java.util.Scanner;
import java.util.HashMap;

public class testeMapaAluno {
	// � Crie uma classe TesteMapaAluno que possui um m�todo main.
	public static void main (String [] args) { 
		Scanner sc = new Scanner (System.in);
		HashMap<Integer, Aluno> listaAlunos = new HashMap();
		int auxMatr;
		String auxNome, auxCurso;
		
		// Crie 5 alunos e os adicionem num Mapa, onde sua chave ser� a matr�cula e o valor o objeto aluno.
		for (int i = 0; i < 5; i++) { 
			System.out.println("Digite uma matricula: ");
			auxMatr = sc.nextInt();
			System.out.println("Digite o seu nome: ");
			auxNome = sc.next();
			System.out.println("Digite o seu curso: ");
			auxCurso = sc.next();
			// aloca��o dos valores digitados acima
			listaAlunos.put((Integer) auxMatr, new Aluno(auxMatr, auxNome, auxCurso)); 
		} // fim do la�o for
		
		// � Digite uma matr�cula (lido pelo teclado) e imprima os dados do aluno que possui a matr�cula digitada.
		System.out.println("Digite uma matricula a ser buscada no mapa: ");
		auxMatr = sc.nextInt();
		
		if (listaAlunos.containsKey(auxMatr) == true) {
			System.out.println(listaAlunos.get(auxMatr));
		}
		// � Caso n�o exista aluno para tal matr�cula imprima uma mensagem(�Aluno n�o encontrado!�).
		else System.out.println("Aluno n�o encontrado");
		
		sc.close();
	}
}
   