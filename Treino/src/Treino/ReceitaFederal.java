package Treino;

import java.util.ArrayList;

public class ReceitaFederal {
	private ArrayList<Pessoa> pessoas;
	
	
	public ReceitaFederal() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	public ReceitaFederal(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public void adicionarPessoas(Pessoa pessoa) {
		boolean add = false;
		for(int i = 0; i < pessoas.size(); i++) {
			if(pessoa instanceof PessoaFisica) {
				if(pessoas.get(i) instanceof PessoaFisica) {
					if(((PessoaFisica)pessoas.get(i)).getCpf().equals(((PessoaFisica)pessoa).getCpf())) {
					add = true;
					break;
				}
			}
		}
		
		else if (pessoa instanceof PessoaJuridica)
			if(pessoas.get(i) instanceof PessoaJuridica) {
				if(((PessoaJuridica)pessoas.get(i)).getCnpj().equals(((PessoaJuridica)pessoa).getCnpj())) {
				add = true;
				break;
			}
		}
	}
		if(!add) {
			pessoas.add(pessoa);
			System.out.println("Pessoas adicionada com sucesso");
		}
		else {
			System.out.println("Pessoas já adicionada");
		}
	}
	
	public void remove(String nome) {
		for(int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i).getNome().toUpperCase().equals(nome.toUpperCase())) {
			pessoas.remove(i);
			System.out.println("Pessoas removida com sucesso");
			break;
		}
	}
	}
	
	public int quantidadePessoasFisica() {
		int cont = 0;
		for(int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i) instanceof PessoaFisica) {
				cont++;
			}
		}
		return cont++;
	}
	
	public int quantidadePessoasJuridica() {
		int cont = 0;
		for(int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i) instanceof PessoaJuridica) {
				cont++;
			}
		}
		return cont++;
	}
	
	public double calcularImposto(Pessoa pessoa) {
		return pessoa.calculaImposto();
	}
	
	public double totalDeImpostoAReceber() {
		double total = 0;
		for(int i = 0; i < pessoas.size(); i++) {
			total += pessoas.get(i).calculaImposto();
		}
		return total;
	}
	
	public String imprimirDados() {
		String str = "";
		for(int i = 0; i < pessoas.size(); i++) {
			str += pessoas.get(i).tostring()+"\n";
		}
		return str;
	}
	
	
}
			
	
	

