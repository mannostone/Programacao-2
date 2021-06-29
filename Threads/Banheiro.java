package Threads;

public class Banheiro {
	public void fazNumero1() {
		String nome = Thread.currentThread().getName();
		// synchronized não permite que varias threads executem ao mesmo tempo, todas as threads entram em uma fila
		// caso o bloco altere algum valor (como uma venda de passagem)
		synchronized(this) {
			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " saindo ja ja");
			
			try {
				Thread.sleep(5000); // Tempo em milisegundos
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando a mão");
			System.out.println(nome + " saindo do banheiro");
		}
	}
	
	public void fazNumero2() {
		String nome = Thread.currentThread().getName();
		
		synchronized(this) {
			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " passando fax");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando a mão");
			System.out.println(nome + " saindo do banheiro");
		}
	}
	
	
	
}
