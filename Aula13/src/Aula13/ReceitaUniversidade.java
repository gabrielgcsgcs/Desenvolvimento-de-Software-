package Aula13;


public class ReceitaUniversidade {
	private double totalReceita = 0;
	
	public ReceitaUniversidade() {
		
	}
	
	public ReceitaUniversidade(int totalReceita) {
		this.totalReceita = totalReceita;
	}

	public double getTotalReceita() {
		return totalReceita;
	}

	public void setTotalReceita(int totalReceita) {
		this.totalReceita = totalReceita;
	}
	
	public void recebePagamento(Aluno aluno, int dia) {
		totalReceita = totalReceita + aluno.pagarMensalidade(dia);
	}
}
