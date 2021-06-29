package Colecoes;

public class Pessoa implements Comparable<Pessoa>{
	// Atributos
	private String nome;
	private int idade;
	// Construtor
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {return nome;}
	public int getIdade() {return idade;}

	@Override
	public String toString() {return "Pessoa [nome=" + nome + ", idade=" + idade + "]";}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa == false) return false; // verifica se � uma instancia da classe pessoa
		// se verdadeiro converte o object em Pessoa
		Pessoa novaPessoa = (Pessoa) obj;
		// se o nome e a idade do construtor forem iguais a do objeto "novaPessoa" � um objeto v�lido
		// equals(obj) compara a posi��o de mem�ria de um atributo
		if ( this.getNome().equals(novaPessoa.getNome()) && this.getIdade() == novaPessoa.getIdade()) {
			return true;
		}
		else {return false;}
	}
	
	@Override
	public int compareTo(Pessoa outro) {
		if (this.getIdade() > outro.getIdade()) {
			return 1; // maior
		}
		else if (this.getIdade() < outro.getIdade()) {
			return -1; // menor
		}
		else return 0; // igual
	}
}