package tratamentoDeEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerDoBotao implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Estou sendo clicado!");
	}
}
