package Aula03;

import java.util.Scanner;

public class Aula03_exer02 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double salario;
		System.out.println("Informe o salario:");
		salario = input.nextDouble();
		salario += salario*0.05;
		if(salario <= 750) {
			salario += 100;
		}
		System.out.println("Novo salário: " + salario);
	}
}
