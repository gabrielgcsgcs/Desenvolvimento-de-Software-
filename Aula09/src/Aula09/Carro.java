package Aula09;


public class Carro {
	private String tipo;
	private String cor;
	private String placa;
	private int num_portas;
	private Pessoa dono;
	
	public Carro() {
		
	}
	
	public Carro(String tipo, String cor, String placa, int num_portas, Pessoa dono) {
		this.tipo = tipo;
		this.cor = cor;
		this.placa = placa;
		this.num_portas = num_portas;
		this.dono = dono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNum_portas() {
		return num_portas;
	}

	public void setNum_portas(int num_portas) {
		this.num_portas = num_portas;
	}
	
	public Pessoa getDono() {
		return dono;
	}
	
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	
	public void ligar() {
		System.out.println("Carro ligado!");
	}
	
	public void desligar() {
		System.out.println("Carro desligado!");
	}
	
	public void acelerar() {
		System.out.println("Carro acelerando!");
	}
	public void frear() {
		System.out.println("Carro freando!");
	}
	
}
