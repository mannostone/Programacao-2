package Exercícios;
// Crie uma classe Produto que possui os atributos, código, descrição,	quantidade e valor (preço).	
public class Produto implements Comparable<Produto>{ 
	
	private int codigo, quantidade;
	private String descricao;
	private double valor;
	
	// construtores
	public Produto () {} // não utilizado
	public Produto (int codigo, String descricao, int quantidade, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
	} // fim do construtor
	
	//Setters
	public void setCodigo(int codigo) {	this.codigo = codigo; }	
	public void setDescricao(String descricao) { this.descricao = descricao; }
	public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
	public void setValor(double valor) { this.valor = valor; }
	//Getters
	public int getCodigo() { return codigo;	}
	public String getDescricao() { return descricao; }
	public int getQuantidade() { return quantidade; }
	public double getValor() { return valor; }
	
	// • Ordene os objetos contidos na lista na ordem crescente baseando-se em seu valor.
	@Override
	public int compareTo (Produto obj) { // compara
		if (this.valor > obj.getValor()) return 1; // maior
		else if (this.valor < obj.getValor()) return -1; // menor
		else return 0; // igual
	}
	
	@Override
	public String toString () {
		return descricao + " -> Valor = " + valor;
	}
}
/*
	 Crie uma classe Produto que possui os atributos, código, descrição,
	quantidade e valor (preço).	
	• Crie uma classe ListaDeProdutos que possui um método main.
	• Dentro do main crie um ArrayList de Produto.
	• Adicione 10 produtos quaisquer.
	• Percorra a lista imprimindo a descrição de cada produto.
	• Ordene os objetos contidos na lista na ordem crescente baseando-se em
	seu valor.
	• Percorra a lista imprimindo o valor de cada objeto.
*/