package Aula05;

import java.util.Scanner;

public class Aula04_exerc5 {
	public static void main(String [] args) {
		int [][]matriz = new int[3][3];
		int [] vetor = new int[3];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < 3; ++j) {
				System.out.println("Informe o número da posição["+i+"]["+j+"]:");
				matriz[i][j] = input.nextInt();
			}
		}
		
		for(int j = 0; j < 3; ++j) {
			int count = 0;
			for(int i = 0; i < 3; ++i) {
				count += matriz[i][j];
			}
			vetor[j] = count;
		}
		System.out.println("Matriz:");
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < 3; ++j) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nVetor:");
		for(int i = 0; i < 3; ++i) {		
			System.out.print(vetor[i]+" ");
		}
	}
}
