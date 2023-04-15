package Aula04;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[10];
		int num, i, pos = -1;
		boolean achou = false;
		System.out.println("Informe 10 números: ");
		for(i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
		}
		System.out.println("Informe um número a ser buscado:");
		num = input.nextInt();
		for(i = 0; i < 10; i++) {
			if(vetor[i] == num) {
				achou = true;
				pos = i;
				break;
			}
		}
		if(achou) {
			System.out.println("O número está no vetor na posição " + pos);
		}
		else {
			System.out.println("O número não está no vetor!");
		}
	}
}
