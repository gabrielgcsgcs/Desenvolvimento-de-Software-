package Aula13;


public class ControleDeGastos {
	private double totalGastos = 0;
	
	public double getTotalGastos() {
		return totalGastos;
	}
	
	public void adicionaGasto(Funcionario f) {
		totalGastos += f.bonificacao();
	}
}
