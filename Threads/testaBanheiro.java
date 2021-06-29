package Threads;

public class testaBanheiro {
	public static void main (String [] args) {
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Mesquita");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Nova Iguaçu");
		Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Madureira");
		Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Deodoro");
		
		convidado1.start();
		convidado2.start();
		convidado3.start();
		convidado4.start();
	}
}
