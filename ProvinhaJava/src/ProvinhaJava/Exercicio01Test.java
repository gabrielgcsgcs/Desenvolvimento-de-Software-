package ProvinhaJava;

import java.util.Scanner;

public class Exercicio01Test {
public static void main(String[] args) {
		
		Exercicio01 e1 = new Exercicio01();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tamanho da lista: ");
		Integer tamanhoLista = scanner.nextInt();
		
		int[] lista = new int[tamanhoLista];
		for(int i = 0; i < lista.length; i++) {
			System.out.println("Valores: ");
			Integer item = scanner.nextInt();
			lista[i] = item;
		}
		
		System.out.println("Maior número do vetor: " + e1.maior(lista)); 
	}
}
