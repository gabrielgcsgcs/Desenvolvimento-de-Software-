package Aula04;

import java.util.Scanner;

public class Aula03_exerc4 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num, soma = 0;
		System.out.println("Informe um número:");
		num = input.nextInt();
		for(int i = 0; i <= num; i++) {
			if(i % 2 == 0) {
				soma += i;
			}
		}
		System.out.println("Soma dos pares: " + soma);
	}
}
