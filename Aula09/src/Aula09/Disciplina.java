package Aula09;


public class Disciplina {
	private String nome;
	private int numCreditos;
	private String ementa;
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, int numCreditos,
						String ementa) {
		this.nome = nome;
		this.numCreditos = numCreditos;
		this.ementa = ementa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumCreditos() {
		return numCreditos;
	}

	public void setNumCreditos(int numCreditos) {
		this.numCreditos = numCreditos;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public String toString() {
		return "Nome da disciplina: " + nome + "\n"
			 + "Número de créditos: " + numCreditos + "\n"
			 + "Ementa: " + ementa +"\n";
	}
}
