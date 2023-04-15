package Aula07;


public class PessoaMain {
	public static void main(String [] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoa.setSobrenome("Silva");
		pessoa.setCpf("970.098.566-32");
		pessoa.setData_nasc("10/03/2000");
		
		System.out.println(pessoa.toString());
	}
}
