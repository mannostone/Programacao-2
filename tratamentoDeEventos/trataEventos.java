package tratamentoDeEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class trataEventos extends JFrame {
		private JButton btnBotao1 = new JButton("Clique aqui");
		private JButton btnBotao2 = new JButton("Segundo botãozin");
		
		private JLabel lblTexto = new JLabel("Texto de teste");
		
		private JPanel painel = new JPanel();		
		
		public void init( ) {
			getContentPane().add(painel);
			painel.add(btnBotao1);
			painel.add(btnBotao2);
			painel.add(lblTexto);
			
			setSize(400,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			// Ação feita em outra classe
			ListenerDoBotao meuListener = new ListenerDoBotao();
			btnBotao1.addActionListener(meuListener);
			
			// Classe anonima - outra forma de dar ação a um botão
			btnBotao2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Cliquei no outro");
				}
			});
			
			// eventos do mouse
			eventosDoMouse eDM = new eventosDoMouse();
			lblTexto.addMouseListener(eDM);
			
			// eventos do teclado
			eventosDeTeclado eDT = new eventosDeTeclado();
			painel.setFocusable(true);
			painel.addKeyListener(eDT);
			
		} // fim do init
		
		// main
		public static void main (String [] args) {
			trataEventos eventos = new trataEventos();
			eventos.init();
		}
}
