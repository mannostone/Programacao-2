package MinhaJanela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class minhaJanela extends JFrame{
	
	public void iniciar() {
		// posição da janela em X = 50
		// posição da janela em y = 100
		// largura = 300
		// altura = 150
		setBounds(50, 100, 300, 150);
		// O que ocorrerá ao clicar em fechar
		
		// ?
		JPanel painel = new JPanel();
		JButton botao = new JButton("sou um botão");
		JLabel label = new JLabel("sou um label");
		
		// adicionando painel a janela
		getContentPane().add(painel);
		// adicionando o botao ao painel
		painel.add(botao);
		// adicionando o label
		painel.add(label);
		// criando e atribuindo o texto a um painel
		JTextField texto = new JTextField(20);
		painel.add(texto);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// exibe a janela
		setVisible(true);
	}
	
	public static void main (String [] args) {
		
		minhaJanela janela = new minhaJanela();
		
		janela.iniciar();
		
	}
}
