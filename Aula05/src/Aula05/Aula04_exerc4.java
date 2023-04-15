package Aula05;

import java.util.Scanner;

public class Aula04_exerc4 {
	public static void main(String [] args) {
		int [] b = new int[10];
		int [] c = new int[10];
		int cont, pos = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Preenchendo o vetor:");
		for(int i = 0; i < 10; ++i) {
			b[i] = input.nextInt();
		}
		
		for(int i = 0; i < 10; ++i) {
			cont = 0;
			for(int j = 0; j < 10; ++j) {
				if(b[i] == b[j] && i != j) {
					cont++;
				}
			}	
			if(cont == 0) {
				c[pos] = b[i];
				pos++;
			}
		}
		System.out.println("Vetor B:");
		for(int i = 0; i < 10; ++i) {
			System.out.print(b[i] + " ");
		}
		System.out.println("\nVetor C:");
		for(int i = 0; i < pos; ++i) {
			System.out.print(c[i] + " ");
		}
	}
}

