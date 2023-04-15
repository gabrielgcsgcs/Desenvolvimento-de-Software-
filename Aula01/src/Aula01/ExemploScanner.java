package Aula01;

import java.util.Scanner;

public class ExemploScanner {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("Informe o primeiro número:");
		num1 = input.nextInt();
		System.out.println("Informe o segundo número:");
		num2 = input.nextInt();
		System.out.println("A soma dos números é: " + (num1 + num2));
	}
}
