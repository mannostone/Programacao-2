package Exercícios;

import java.util.Scanner;
import java.util.HashMap;

public class testeMapaAluno {
	// • Crie uma classe TesteMapaAluno que possui um método main.
	public static void main (String [] args) { 
		Scanner sc = new Scanner (System.in);
		HashMap<Integer, Aluno> listaAlunos = new HashMap();
		int auxMatr;
		String auxNome, auxCurso;
		
		// Crie 5 alunos e os adicionem num Mapa, onde sua chave será a matrícula e o valor o objeto aluno.
		for (int i = 0; i < 5; i++) { 
			System.out.println("Digite uma matricula: ");
			auxMatr = sc.nextInt();
			System.out.println("Digite o seu nome: ");
			auxNome = sc.next();
			System.out.println("Digite o seu curso: ");
			auxCurso = sc.next();
			// alocação dos valores digitados acima
			listaAlunos.put((Integer) auxMatr, new Aluno(auxMatr, auxNome, auxCurso)); 
		} // fim do laço for
		
		// • Digite uma matrícula (lido pelo teclado) e imprima os dados do aluno que possui a matrícula digitada.
		System.out.println("Digite uma matricula a ser buscada no mapa: ");
		auxMatr = sc.nextInt();
		
		if (listaAlunos.containsKey(auxMatr) == true) {
			System.out.println(listaAlunos.get(auxMatr));
		}
		// • Caso não exista aluno para tal matrícula imprima uma mensagem(“Aluno não encontrado!”).
		else System.out.println("Aluno não encontrado");
		
		sc.close();
	}
}
   