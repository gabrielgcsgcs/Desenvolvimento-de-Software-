package Treino;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String nome, String endereco, double RendaBruta, String cnpj) {
		super(nome, endereco, RendaBruta);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String tostring() {
		return super.tostring() + "\n" +
					"cnpj: " + cnpj;
	}
}
