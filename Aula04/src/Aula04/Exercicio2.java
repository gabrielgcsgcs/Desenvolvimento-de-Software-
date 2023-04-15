package Aula04;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[10];
		int i, num, cont = 0;
		System.out.println("Preenchendo o vetor:");
		for(i = 0; i < 10; i++) {
			System.out.println("Informe o nº da posição " + i);
			vetor[i] = input.nextInt();
		}
		System.out.println("Informe o número a ser buscado:");
		num = input.nextInt();
		for(i = 0; i < 10; i++) {
			if(vetor[i] == num) {
				cont++;
			}
		}
		System.out.println("O número aparece " + cont +
							" vezes no vetor");
	}
}
