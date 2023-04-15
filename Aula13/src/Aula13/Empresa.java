package Aula13;

import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String cnpj;
	private ArrayList<Empregado> empregados;
	
	public Empresa() {
		empregados = new ArrayList<Empregado>();
	}
	
	public Empresa(String nome, String cnpj, 
					ArrayList<Empregado> empregados) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.empregados = empregados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(ArrayList<Empregado> empregados) {
		this.empregados = empregados;
	}
	
	public void adicionarEmpregado(Empregado emp) {
		empregados.add(emp);
	}
	
	public int quantidadeEmpregados() {
		return empregados.size();
	}
	
	public int quantidadeHoristas() {
		int cont = 0;
		for(int i = 0; i < empregados.size(); i++) {
			if(empregados.get(i) instanceof Horista) {
				cont++;
			}
		}
		return cont;
	}
	
	public int quantidadeAssalariado() {
		int cont = 0;
		for(int i = 0; i < empregados.size(); i++) {
			if(empregados.get(i) instanceof Assalariado) {
				cont++;
			}
		}
		return cont;
	}
	
	public double custoMensal() {
		double custo = 0;
		for(int i = 0; i < empregados.size(); i++) {
			custo += empregados.get(i).salarioMensal();
		}
		return custo;
	}
}
