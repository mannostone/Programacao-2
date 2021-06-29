package Sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main (String [] args){
		// Definindo o IP e a porta de conexão
		String enderecoIP = "127.0.0.1";
		int numeroPorta = 12345;
		
		try {
			// Criando uma nova conexão com o servidor
			Socket cliente = new Socket(enderecoIP, numeroPorta);
			System.out.println("Cliente se conectou ao servidor");
			// Captura os dados do cliente para o envio ao servidor
			Scanner sc = new Scanner(System.in);
			// Define a saida dos dados para o servidor
			PrintStream saida = new PrintStream(cliente.getOutputStream());
			// Enquanto o Cliente continuar digitando
			while (sc.hasNext()) {
				// Imprima no console do servidor
				saida.println(sc.nextLine());
			}
			// Fechando as instâncias
			saida.close();
			sc.close();
			cliente.close();
			
		} catch (UnknownHostException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
