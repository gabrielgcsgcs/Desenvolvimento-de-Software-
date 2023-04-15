package Aula09;


public class ObjetoCarro {
	public static void main(String [] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria");
		p1.setSobrenome("dos Santos");
		p1.setCpf("809.098.754-12");
		p1.setData_nasc("20/10/2000");
		
		Carro c1 = new Carro();
		c1.setTipo("Corolla");
		c1.setCor("Cinza");
		c1.setPlaca("POL9087");
		c1.setNum_portas(4);
		c1.setDono(p1);
	}
}
