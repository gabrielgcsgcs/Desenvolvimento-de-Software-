package Aula12;

public class Imovel {
	protected String endereco;
	protected double preco;
	
	public Imovel() {
		
	}
	
	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void imprimir() {
		System.out.println("Endereço:  " + endereco + "\nPreço: " + preco + "\n");
	}
}
