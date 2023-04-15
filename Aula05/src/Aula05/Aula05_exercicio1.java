package Aula05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Aula05_exercicio1 {
	public static void main(String [] args) {
		ArrayList<Integer> conjunto = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Informe um número");
		num = input.nextInt();
		while(num != -1) {
			if(!conjunto.contains(num)) {
				conjunto.add(num);
			}
			else {
				System.out.println("O conjunto já contém o número!");
			}
			System.out.println("Informe um número");
			num = input.nextInt();
		}
		System.out.println("Conjunto ordenado:");
		Collections.sort(conjunto);
		System.out.println(conjunto.toString());
	}
}
