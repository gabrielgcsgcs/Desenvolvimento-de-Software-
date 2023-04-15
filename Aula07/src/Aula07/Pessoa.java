package Aula07;


public class Pessoa {
	private String nome;
	private String sobrenome;
	private String cpf;
	private String data_nasc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	public String toString() {
		String dados = "Nome: " + nome + " " + sobrenome +"\n"
				+ "CPF: " + cpf + "\n"
				+ "Data de nascimento: " + data_nasc;
		return dados;
	}	
	
}
