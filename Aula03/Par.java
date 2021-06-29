package Aula03;

public class Par <T,U>{
	
	private T linha;
	private U coluna;
	
	// Os tipos gen�ricos s� podem ser referenciados por tipos classes, n�o por tipos primitivos
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
