package Aula08;


public class MainCarro {
	public static void main(String [] args) {
		Carro c1 = new Carro();
		c1.setTipo("Sedan");
		c1.setCor("Prata");
		c1.setPlaca("JMN0996");
		c1.setNum_portas(4);
		
		Carro c2 = new Carro("Porshe", "Branca", "KMN9856", 2);
		
		System.out.println("Carro 1:");
		System.out.println("Tipo: " + c1.getTipo());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("Placa: " + c1.getPlaca());
		System.out.println("Número de portas: " + c1.getNum_portas());
		
		System.out.println("\nCarro2:");
		System.out.println("Tipo: " + c2.getTipo());
		System.out.println("Cor: " + c2.getCor());
		System.out.println("Placa: " + c2.getPlaca());
		System.out.println("Número de portas: " + c2.getNum_portas());
	}
}
