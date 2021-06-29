package Threads;

public class Dormindo implements Runnable{

	
	@Override
	public void run() {
		// Teste da função sleep
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
