package genericos;

public class aluno extends Object {
	private String nome;
	private float nota;
	//construtor
	public aluno(String nome, float nota) {
		this.nome = nome;
		this.nota = nota;
	}
	//getters e setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return nome;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public float getNota() {
		return nota;
	}
	//sobreescrita de uma função Object que intervem em funções com retorno do tipo String
	@Override
	public String toString() {
		return "Aluno{" + "nome=" + nome + '}';
	}
}
