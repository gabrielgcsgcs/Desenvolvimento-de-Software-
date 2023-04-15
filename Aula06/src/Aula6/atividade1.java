package Aula6;

import java.util.Scanner;

public class atividade1 {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	int maior = 0;
	int menor = 0;
	int numero = 0;
	boolean test = true;
	System.out.println("Informe um numero: ");
	while(numero >= 0) {
		numero = input.nextInt();
		if(test == true) {
			maior = numero;
			menor = numero;
		}
		test = false;
		if(numero >= 0) {
			if(maior < numero) {
				maior = numero;
			}
			if(menor > numero) {
				menor = numero;
			}
		}
	}
	System.out.println("Menor: " + menor);
	System.out.println("Maior: " + maior);
	}
}
