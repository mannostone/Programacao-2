package Threads;

public class CorridaMaluca {
	public static void main (String [] args) {
		// "Tamanho" do circuito
		double tamanhoCircuito = 1000000000;
		// Criando pilotos
		Piloto p1 = new Piloto("Dick Vigarista", 1.47, tamanhoCircuito);
		Piloto p2 = new Piloto("Irmãos Rocha", 1.42, tamanhoCircuito);
		Piloto p3 = new Piloto("Peter Perfeito", 1.4, tamanhoCircuito);
		Piloto p4 = new Piloto("Penelope", 1.41, tamanhoCircuito);
		Piloto p5 = new Piloto("Manno", 1.5, tamanhoCircuito);
		Piloto p6 = new Piloto("O Professor", 1.46, tamanhoCircuito);
		Piloto p7 = new Piloto("Os 7 anões", 1.49, tamanhoCircuito);
		Piloto p8 = new Piloto("Irmãos Metralha", 1.357, tamanhoCircuito);
		Piloto p9 = new Piloto("SpeedRacer", 1.49, tamanhoCircuito);
		Piloto p10 = new Piloto("Malcon X", 1.49, tamanhoCircuito);
		// Criando as Threads, onde cada piloto inicia em uma Thread diferente, sendo assim em paralelo
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		Thread t4 = new Thread(p4);
		Thread t5 = new Thread(p5);
		Thread t6 = new Thread(p6);
		Thread t7 = new Thread(p7);
		Thread t8 = new Thread(p8);
		Thread t9= new Thread(p9);
		Thread t10 = new Thread(p10);
		// Iniciando as Threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
	}
}
