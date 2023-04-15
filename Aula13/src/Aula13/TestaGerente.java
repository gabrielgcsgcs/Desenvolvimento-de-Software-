package Aula13;


public class TestaGerente {
	public static void main(String [] args) {
		Gerente gerente = new Gerente("João da Silva", 
				"907.099.988-98", 1000, "Administrativo");
		//System.out.println(gerente.bonificacao());
		
		ControleDeGastos cg = new ControleDeGastos();
		
		System.out.println("Gastos: " + cg.getTotalGastos());
		
		Funcionario func = new Funcionario("Maria dos Santos", 
				"097.099.647-00", 2500);
		
		cg.adicionaGasto(gerente);
		
		System.out.println("Gastos atual: " + cg.getTotalGastos());
		
		cg.adicionaGasto(func);
		
		System.out.println("Gastos atual: " + cg.getTotalGastos());
	}
}
