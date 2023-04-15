package Aula12;

import java.util.ArrayList;

public class TestaToString {
	public static void main(String [] args) {
		String nome = "Exemplo";
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(6);
		numeros.add(20);
		
		System.out.println(nome.toString());
		System.out.println(numeros.toString());
		
		Empregado e1 = new Empregado("José da Silva", "Rua das flores", "9087-9988", 10, 1500, 5);
		
		System.out.println(e1.toString());
	}
}
