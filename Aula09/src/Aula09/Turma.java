package Aula09;


public class Turma {
	private String nome;
	private String turno;
	private String curso;
	private int numAlunos;
	private Disciplina disciplina;
	
	public Turma() {
		
	}
	
	public Turma(String nome, String turno, String curso,
				int numAlunos, Disciplina disciplina) {
		this.nome = nome;
		this.turno = turno;
		this.curso = curso;
		this.numAlunos = numAlunos;
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNumAlunos() {
		return numAlunos;
	}

	public void setNumAlunos(int numAlunos) {
		this.numAlunos = numAlunos;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString() {
		return "Nome da turma: " + nome + "\n"+
			   "Turno: " + turno + "\n" +
			   "Nome do curso: " + curso + "\n" +
			   "Quantidade de alunos: " + numAlunos + "\n" +
			   disciplina.toString();
	}
}
