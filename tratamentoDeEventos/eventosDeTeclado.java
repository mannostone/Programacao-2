package tratamentoDeEventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class eventosDeTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) { // com erro
		if (e.getKeyCode() == KeyEvent.VK_ENTER); System.out.println("Seta pra direita");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	
	
}
