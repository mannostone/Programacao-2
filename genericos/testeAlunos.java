package genericos;

import java.util.ArrayList;
import java.util.List;

public class testeAlunos {
	public static void main (String [] args) {
		// atributos
		aluno a1 = new aluno ("Carlos",7.5f);
		aluno a2 = new aluno ("Regelâine", 6.5f);
		aluno a3 = new aluno ("Cruzcredovaldo", 9.7f);
		aluno a4 = new aluno ("que", 6.0f);
		aluno a5 = new aluno ("quedrogahein", 6.5f);
		// vetor criado e instanciado
		aluno[] lista = new aluno[3];
		lista[0] = a1;
		lista[1] = a2;
		lista[2] = a3;
		// laço para mostrar os valores
		/* for (int i = 0; i < 3; i++) {
			System.out.println(lista[i]);
		} */
		
		// criação de uma "lista dinâmica"
		List lista2 = new ArrayList(); // lista "infinita" de qualquer tipo de dado de qualquer classe(tamanho nao definido)
		lista2.add(a1);
		lista2.add(a2);
		lista2.add(a3);
		lista2.add(a4);
		lista2.add(a5);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(lista2.get(i));
		}
		
		List<aluno> lista3 = new ArrayList(); // lista que só vai receber objetos pertencentes a alunos
		lista3.add(a1);
		lista3.add(a2);
		lista3.add(a3);
		for (int i = 0; i < 3; i++) {
			System.out.println(lista3.get(i));
		}
	}
}
