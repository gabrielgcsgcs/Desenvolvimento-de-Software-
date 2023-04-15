package Aula12;

public class testaPessoa {
	public static void main(String [] args) {
		Pessoa pessoa = new Pessoa("João da Silva", "Rua das Flores, 150", "9008-0099");
		System.out.println("Dados da pessoa:");
		pessoa.toString();
		Fornecedor fornecedor = new Fornecedor("José Pacheco", "Rua 10, 51", "98476-0022", 1200, 300);
		System.out.println("\nDados do fornecedor");
		fornecedor.imprimir();
		System.out.println("Saldo do fornecedor: "+fornecedor.obterSaldo());
		Empregado empregado = new Empregado("Maria dos Santos", "Rua 100, 20", "3323-0098", 10, 1000, 0.1);
		System.out.println("\nDados do Empregado:");
		empregado.toString();
		System.out.println("Salário do empregado: "+empregado.salario());
	}
}

