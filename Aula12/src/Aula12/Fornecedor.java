package Aula12;

public class Fornecedor extends Pessoa{
	protected float valorCredito;
	protected float valorDivida;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public float obterSaldo() {
		return valorCredito - valorDivida;
	}
	
	public void imprimir() {
		super.toString();
		System.out.println("Crédito: " + valorCredito + "\n"
						 + "Dívida: " + valorDivida);
	}
}
