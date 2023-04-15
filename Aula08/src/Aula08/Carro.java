package Aula08;


public class Carro {
	private String tipo;
	private String cor;
	private String placa;
	private int num_portas;
	
	public Carro() {
		
	}
	
	public Carro(String tipo, String cor, String placa, 
					int num_portas) {
		this.tipo = tipo;
		this.cor = cor;
		this.placa = placa;
		this.num_portas = num_portas;
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
	
	
}
