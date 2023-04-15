package Aula13;


public class Aluno {
	private String nome;
	private int registro;
	private double mensalidade;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int registro, double mensalidade) {
		this.nome = nome;
		this.registro = registro;
		this.mensalidade = mensalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public double pagarMensalidade(int dia) {
		if(dia <= 5) {
			return mensalidade - mensalidade*0.05;
		}
		else if(dia > 10){
			return mensalidade + mensalidade*0.1;
		}
		else {
			return mensalidade;
		}
	}
}
