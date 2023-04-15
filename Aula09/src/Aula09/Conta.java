package Aula09;


public class Conta {
	private String tipo;
	private String numero;
	private String cliente;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String tipo, String numero, String cliente, double saldo) {
		this.tipo = tipo;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double sacar(double valor) {
		if(saldo < valor) {
			System.out.println("Saldo insuficiente!");
			return -1;
		}
		else {
			saldo -= valor;
			return saldo;
		}
	}
	
	public double depositar(double valor) {
		saldo += valor;
		return saldo;
	}
	
	public String toString() {
		return "Cliente: " + cliente + 
			   "\nTipo da conta: " + tipo +
			   "\nNúmero da conta: " + numero +
			   "\nSaldo: " + saldo;
	}
}
