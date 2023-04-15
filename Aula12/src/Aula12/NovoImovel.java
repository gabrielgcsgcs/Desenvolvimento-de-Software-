package Aula12;

public class NovoImovel extends Imovel{
	protected double adicional;
	
	public NovoImovel() {
		
	}
	
	public NovoImovel(String endereco, double preco, double adicional) {
		super(endereco, preco);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double novoPreco() {
		return preco + preco*(adicional/100);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Adicional: " + adicional);
	}
}
