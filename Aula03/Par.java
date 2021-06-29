package Aula03;

public class Par <T,U>{
	
	private T linha;
	private U coluna;
	
	// Os tipos genéricos só podem ser referenciados por tipos classes, não por tipos primitivos
	public Par(T linha, U coluna) {
	super();
	this.linha = linha;
	this.coluna = coluna;
	}
	
	@Override
	public String toString() {
		return "Par [linha=" + linha + ", coluna=" + coluna + "]";
		
	}
}
