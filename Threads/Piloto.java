package Threads;

public class Piloto implements Runnable{
	// 
	private String nome;
	private double velocidade;
	private double distanciaCircuito;
	private double distanciaPercorrida;
	// Construtor
	public Piloto(String nome, double velocidade, double distanciaCircuito) {
		super();
		this.nome = nome;
		this.velocidade = velocidade;
		this.distanciaCircuito = distanciaCircuito;
		this.distanciaPercorrida = 0;
	}
	// distanciaPercorrida recebe a velocidade do carro
	public void acelera() {
		while (distanciaPercorrida <= distanciaCircuito) {
			distanciaPercorrida += velocidade;
			// System.out.printf(nome + " esta no KM %.2f\n", distanciaPercorrida);
		}
		// Será exibido quando chegar ao valor estipulado na distanciaCircuito
		System.out.println(nome + " TERMINOU ");
	}
	// Override do método que pertence a Runnable
	@Override
	public void run() {
		acelera();
	}	
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public double getVelocidade() {return velocidade;}
	public void setVelocidade(double velocidade) {this.velocidade = velocidade;}
	public double getDistanciaCircuito() {return distanciaCircuito;}
	public void setDistanciaCircuito(double distanciaCircuito) {this.distanciaCircuito = distanciaCircuito;}
	public double getDistanciaPercorrida() {return distanciaPercorrida;}
	public void setDistanciaPercorrida(double distanciaPercorrida) {this.distanciaPercorrida = distanciaPercorrida;}
}
