package Aula12;

public class ImovelVelho extends Imovel{
	protected double desconto;
	
	public ImovelVelho() {
		
	}
	
	public ImovelVelho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double novoPreco() {
		return preco - preco*(desconto/100);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Desconto: " + desconto);
	}
}
