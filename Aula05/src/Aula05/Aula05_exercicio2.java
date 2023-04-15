package Aula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula05_exercicio2 {
	public static void main(String [] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String nome;
		boolean achou = false;
		System.out.println("Informe um nome:");
		nome = input.nextLine();
		while(!nome.equalsIgnoreCase("fim")){
			nomes.add(nome);
			System.out.println("Informe um nome:");
			nome = input.nextLine();
		}
		System.out.println("Informe um nome a ser buscado:");
		nome = input.nextLine();
		for(int i = 0; i < nomes.size(); i++) {
			if(nomes.get(i).equalsIgnoreCase(nome)) {
				System.out.println("O nome " + nome + 
						" está no arraylist na posição " + i);
				achou = true;
			}
		}
		if(!achou) {
			System.out.println("O nome não está no vetor!");
		}
		System.out.println("Informe um nome a ser removido:");
		nome = input.nextLine();
		achou = false;
		for(int i = 0; i < nomes.size(); i++) {
			if(nomes.get(i).equalsIgnoreCase(nome)) {
				nomes.remove(nome);
				achou = true;
				System.out.println("O nome " + nome + " estava na posição "
						+ i + " e foi removido com sucesso!");
			}
		}
		if(!achou) {
			System.out.println("O nome não está no vetor!");
		}
	}
}

	