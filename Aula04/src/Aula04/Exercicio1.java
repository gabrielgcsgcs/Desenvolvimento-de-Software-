package Aula04;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[10];
		System.out.println("Informe 10 números: ");
		for(int i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.println("O número " + vetor[i] + 
						" da posição "+ i + " é par!" );
			}
		}
	}
}
