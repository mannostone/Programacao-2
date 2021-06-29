package genericos;

public class DadoGenerico<T> { // classe criada com um tipo genérico "T"
	private T dado; // tipo genérico sendo utilizado na criação de um atributo
	
	public DadoGenerico (T dado) { // construtor
		this.dado = dado;
	}
	public T getDado () { // função que ira retornar um dado genérico
		return dado;
	}

}
