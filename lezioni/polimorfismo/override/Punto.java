package lezioni.polimorfismo.override;

class Punto {
	
	private int x, y;

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
	
	public double distanzaDallOrigine() {
		return Math.sqrt((x + x) + (y + y));
	}
	
}
