package Exerc�cios;

import java.util.Scanner;
import java.util.HashSet;

public class testeHashSetCPF {
	// � Crie uma classe TesteHashSetCPF que possui um m�todo main.
	public static void main (String [] args) { 
		Scanner sc = new Scanner (System.in);
		// � Dentro do main crie um HashSet de String.
		HashSet<String> listaCPF = new HashSet(); 
		// � Adicione 10 CPF (Strings) informados pelo usu�rio.
		System.out.println("Digite 10 CPFs");
		for (int i = 0; i < 10; i++) listaCPF.add(new String (sc.next()));
		// Digite alguns CPF repetidos e verifique o conte�do do conjunto criado (HashSet) utilizando um for para percorr�-lo
		for (String indice : listaCPF); System.out.println(listaCPF);
		// HashSet n�o permite valores repetidos
	}
}
