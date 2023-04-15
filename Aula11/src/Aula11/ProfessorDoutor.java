package Aula11;


public class ProfessorDoutor extends Professor{
	private int anoTitulo;
	private String instituicao;
	
	public ProfessorDoutor() {
		
	}
	
	public ProfessorDoutor(String nome, String cpf, char sexo, 
			String departamento, int anoAdmissao, int anoTitulo, 
			String instituicao) {
		super(nome, cpf, sexo, departamento, anoAdmissao);
		this.anoTitulo = anoTitulo;
		this.instituicao = instituicao;
	}

	public int getAnoTitulo() {
		return anoTitulo;
	}

	public void setAnoTitulo(int anoTitulo) {
		this.anoTitulo = anoTitulo;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public String toString() {
		return super.toString() +
					"Ano de obtenção do Título: " + anoTitulo + "\n" +
					"Instituição: " + instituicao;
	}

}
