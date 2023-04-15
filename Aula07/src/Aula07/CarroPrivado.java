package Aula07;


public class CarroPrivado {
	private String tipo;
	private String cor;
	private String placa;
	private int num_portas;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tp) {
		tipo = tp;
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
	
	public void liga() {
		System.out.println("Carro ligado!");
	}
	
	public void desliga() {
		System.out.println("Carro desligado!");
	}
	
	public void acelera() {
		System.out.println("Carro acelerando!");
	}
	
	public void frear() {
		System.out.println("Carro Freando!");
	}
}
