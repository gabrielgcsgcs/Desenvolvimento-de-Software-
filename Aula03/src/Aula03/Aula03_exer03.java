package Aula03;

import java.util.Scanner;

public class Aula03_exer03 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double temp, conv = 0;
		int op;
		System.out.println("Informe a temperatura em celsius:");
		temp = input.nextDouble();
		System.out.println("Informe a conversão: \n"
				+ "1 - Kelvin (K)\n"
				+ "2 - Réaumur (Re)\n"
				+ "3 - Rankine (Ra) \n"
				+ "4 - Fahrenheit (F)\n");
		op = input.nextInt();
		switch (op) {
		case 1: {
			conv = temp*1.8 + 32;
			break;
		}
		case 2:{
			conv = temp + 273.15;
			break;
		}
		case 3:{
			conv = temp * 0.8;
			break;
		}
		case 4:{
			conv = temp*1.8 + 459;
			break;
		}	
		default:
			System.out.println("Opção inválida!");
		}
		System.out.println("Temperatura convertida: " + conv);
	}
}