package Aula08;


public class PsedoCalculadora {
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int soma() {
		return x+y;
	}
	
	public int subtracao() {
		return x-y;
	}
	
	public int multiplicacao() {
		return x*y;
	}
	
	public int divisao() {
		if(y == 0) {
			return -1;
		}
		else {
			return x/y;
		}
	}
}
