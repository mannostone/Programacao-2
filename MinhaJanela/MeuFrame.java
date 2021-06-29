package MinhaJanela;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class MeuFrame extends JFrame {

	// criando um novo painel (container)
	private JPanel painel = new JPanel();
	
	// componentes que estarão dentro do painel
	// Campo de texto estático
	private JLabel lbl_texto = new JLabel("Texto"); 
	
	// Botões
	private JButton btn_1 = new JButton("Botão 1"); 
	private JButton btn_2 = new JButton("Botão 2");
	private JButton btn_3 = new JButton("Botão 3");
	
	// Cursor do mouse
	private Cursor hand = new Cursor(Cursor.HAND_CURSOR);

	// Tipo de fonte utilizada no programa (BOLD = negrito)
	// new Font(familiaDaFonte, tipoDaFonte, tamanho)
	private Font arial = new Font("Arial", Font.BOLD,14); 
	
	// Borda da janela
	private Border borda = new LineBorder (Color.blue, 2); 
	
	// criando campos de login e senha
	private JTextField txt_campo1 = new JTextField(20);
	private JPasswordField txt_senha = new JPasswordField(20);
	
	// Construtor
	public MeuFrame() {	super("Componentes Swing");	}
	
	// método que inicializará uma nova janela
	public void init () {
		// Anexando o painel ao JFrame (janela)
		
		getContentPane().add(painel);
		// adicionando campos
		
		painel.add(btn_1);
		painel.add(btn_2);
		painel.add(btn_3);
		painel.add(lbl_texto);
		
		// adicionando uma borda
		painel.setBorder(borda);
		
		// adicionando campos de login e senha
		painel.add(txt_campo1);
		painel.add(txt_senha);
		
		// Troca o cursor ao passar o mouse por cima
		btn_1.setCursor(hand);
		btn_2.setCursor(hand);
		
		// desabilitar um botão
		btn_3.setEnabled(false); 
		
		// definindo a cor de um botão
		btn_1.setBackground(Color.red);
		
		// definindo a cor da fonte
		btn_1.setForeground(Color.white);
		
		// define uma fonte ao texto
		lbl_texto.setFont(arial);
		
		// Exibe dica ao parar o mouse em cima
		btn_1.setToolTipText("Eu sou um botão!");
		
		// Tamanho da janela(posX, posY, largura, altura)
		setBounds(50, 100, 400, 150);
		
		// A janela será encerrada ao clicar em close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Exibe a janela
		setVisible(true);
	}
	
	// main
	public static void main (String [] args) {
		MeuFrame frame = new MeuFrame();
		frame.init();
	}
}
