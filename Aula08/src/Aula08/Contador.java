package Aula08;


public class Contador {
	private int numero = 0;
	
	public Contador() {
		
	}
	
	public Contador(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int zerar() {
		numero = 0;
		return numero = 0;
	}
	
	public int incrementar() {
		return ++numero;
	}
	
	public int decrementar() {
		numero--;
		return numero;
	}
	
	public int somar(int valor) {
		numero += valor;
		return valor;
	}
	
	public int subtrair(int valor) {
		numero -= valor;
		return numero;
	}
	
	
}
