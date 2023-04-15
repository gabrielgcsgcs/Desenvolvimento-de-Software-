package Aula13;


public class Bolsista extends Aluno{
	private double desconto;
	
	public Bolsista() {
		
	}
	
	public Bolsista(String nome, int registro, double mensalidade,
				double desconto) {
		super(nome, registro, mensalidade);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double pagarMensalidade(int dia) {
		if(dia <= 15) {
			return getMensalidade() - getMensalidade()*(desconto/100);
		}
		else {
			return getMensalidade();
		}
	}
}
