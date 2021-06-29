package genericos;

public class DadoGenerico<T> { // classe criada com um tipo gen�rico "T"
	private T dado; // tipo gen�rico sendo utilizado na cria��o de um atributo
	
	public DadoGenerico (T dado) { // construtor
		this.dado = dado;
	}
	public T getDado () { // fun��o que ira retornar um dado gen�rico
		return dado;
	}

}
