package Exercícios;
// • Crie uma classe Aluno que possui os atributos matricula, nome e curso.
public class Aluno { 
	private int matricula;
	private String nome, curso;
	
	public Aluno () {}
	// • Nessa mesma classe crie um construtor que receba valores como parâmetro para cada atributo da classe.
	public Aluno (int matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}
	// Setters
	public void setMatricula (int matricula) { this.matricula = matricula; }
	public void setNome (String nome) { this.nome = nome; }
	public void setCurso(String curso) { this.curso = curso; }
	// Getters
	public long getMatricula () { return matricula; }
	public String getNome () { return nome; }
	public String getCurso () { return curso; }
	
	// Necessário para exibir as duas últimas etapas do exercício
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", curso=" + curso + "]";
	}
}
