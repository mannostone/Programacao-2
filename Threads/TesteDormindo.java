package Threads;

public class TesteDormindo {
	public static void main (String [] args) {
		// Usando a Thread (a implementação do Runnable ja foi feita na classe Dormindo)
		Dormindo dormindo = new Dormindo();
		dormindo.run();
		
		// Outra forma de criar uma Thread
		// Thread t1 = new Thread(dormindo);
		// t1.run();
	}
}
