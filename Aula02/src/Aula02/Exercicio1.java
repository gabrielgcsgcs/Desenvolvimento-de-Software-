package Aula02;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		int resultado;
		System.out.println("Informe o primeiro número:");
		num1 = input.nextInt();
		System.out.println("Informe o segundo número:");
		num2 = input.nextInt();
		resultado = num1 + num2;
		System.out.println("A soma dos números é: " + resultado);
		resultado = num1 - num2;
		System.out.println("A subtração dos números é: " + resultado);
		resultado = num1 * num2;
		System.out.println("A multiplicação dos números é: "+ resultado);
		resultado = num1/num2;
		System.out.println("A divisão dos números é: " + resultado);
		resultado = num1 % num2;
		System.out.println("O resto da divisão dos números é: " + resultado);
	}
}