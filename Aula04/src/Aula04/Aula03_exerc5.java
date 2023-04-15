package Aula04;

import java.util.Scanner;

public class Aula03_exerc5 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double num = 0, soma = 0, cont = 0;
		System.out.println("Informe um número:");
		num = input.nextDouble();
		while(num != 0) {
			soma += num;
			cont++;
			System.out.println("Informe um número:");
			num = input.nextDouble();
		}
		soma /= cont;
		System.out.println("Média: " + soma);
	}
}

