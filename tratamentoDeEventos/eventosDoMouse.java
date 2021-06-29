package tratamentoDeEventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class eventosDoMouse implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Cliquei no texto");		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Clicando no texto");		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Soltei no texto");		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Atropelei o texto");		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Liberei o texto");		
		
	}

}
