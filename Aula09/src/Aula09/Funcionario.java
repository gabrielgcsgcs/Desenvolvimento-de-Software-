package Aula09;


public class Funcionario {
	private String nome;
	private String sobrenome;
	private double horas;
	private double valor;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sobrenome, double horas, double valor) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.horas = horas;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	public double calcularSalario() {
		return horas*valor;
	}
	
	public double incrementarHoras(double valor) {
		horas += valor;
		return horas;
	}
	
	public double decrementarHoras(double valor) {
		horas -= valor;
		return horas;
	}
	
	public double aumentarValorHora(double porcentagem) {
		valor += (valor*porcentagem)/100;
		return valor;
	}
}
