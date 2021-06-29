package Aula03;

public class produtoGenerico <T> {
	// Variáveis
	private T codigo;
	private String descricao;
	private double preco;
	// Construtor
	public produtoGenerico(T codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	// Métodos
	public T getCodigo() {return codigo;}
	public String getDescricao() {return descricao;}
	public double getPreco() {return preco;}
	
	@Override
	public String toString() {
		return "Produto Generico [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	
}
