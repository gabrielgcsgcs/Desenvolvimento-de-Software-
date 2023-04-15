package Aula08;


public class MainContador {
	public static void main(String [] args) {
		Contador c = new Contador(10);
		System.out.println(c.incrementar());
		System.out.println(c.getNumero());
	}
}
