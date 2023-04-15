package Aula02;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num, dezena, aux;
		System.out.println("Informe um número inteiro de 3 casas");
		num = input.nextInt();
		aux = num/10;
		dezena = aux % 10;
		System.out.println("Número das dezenas: " + dezena);
	}
}
