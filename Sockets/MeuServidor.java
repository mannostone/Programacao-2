package Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MeuServidor {
	public static void main (String [] args) throws IOException{
		// criando um "Servidor" / o parâmetro do construtor seria a porta de conexão
		// quem acessa a porta é redirecionado para liberar a porta informada no construtor
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta");
		// aceita a conexão
		Socket cliente = servidor.accept();
		
		System.out.println("Nova conexão com cliente " + cliente.getInetAddress().getHostAddress());
		
		// Recebendo dados que o cliente esta passando
		Scanner sc = new Scanner(cliente.getInputStream());
		// Enquanto cliente estiver digitando
		while (sc.hasNextLine()) {
			// "sc.next()" captura a proxima palavra
			// "sc.nextLine();" captura a proxima linha
			System.out.println(sc.nextLine());
		}
		
		System.out.println("To caindo fora " + cliente.getInetAddress().getHostAddress());

		sc.close();
		servidor.close();
		cliente.close();
		
	}	
}
