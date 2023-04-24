package Treino;

public class TestReceitaFederal {
	public static void main(String [] args) {
		ReceitaFederal rf = new ReceitaFederal();
		PessoaFisica pf = new PessoaFisica("Gabriel", "juracy huga cabral, ", 3000, "000.000.000-77");
		rf.adicionarPessoas(pf);
		PessoaJuridica pj = new PessoaJuridica("Gabriel", "juracy huga cabral", 3000, "400.000.030-77");
		rf.adicionarPessoas(pj);
		
		System.out.println("Pessoa fisica: " + rf.quantidadePessoasFisica());
		System.out.println("Pessoa juridica: " + rf.quantidadePessoasJuridica());
		System.out.println("Total imposto " + rf.totalDeImpostoAReceber());
		System.out.println("Pessoas: \n" + rf.imprimirDados());
	}
}
