package Aula04;

import java.util.Scanner;

public class Aula03_exerc6 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String sobrenome, nome;
		int count = 0;
		String result = "";
		System.out.println("Informe um sobrenome:");
		sobrenome = input.next();
		input.nextLine();
		System.out.println("Informe um nome");
		nome = input.nextLine();
		while(!nome.toLowerCase().equals("fim") ) {
			if(nome.toLowerCase().contains(sobrenome.toLowerCase())) {
				count++;
				result += nome+"\n";
			}
			System.out.println("Informe um nome");
			nome = input.nextLine();
		}
		System.out.println(count + " pessoas possuem o sobrenome " + sobrenome);
		System.out.println(result);
	}
}
