package Aula03;

import java.util.Scanner;

public class Aula03_exer01 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		System.out.println("Informe 4 notas:");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		n4 = input.nextDouble();
		media = (n1+n2+n3+n4)/4;
		System.out.println("Média: " + media);
		if(media >= 6) {
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado!");
		}
	}
	 
}
