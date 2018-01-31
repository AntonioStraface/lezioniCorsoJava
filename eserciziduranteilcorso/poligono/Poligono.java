package eserciziduranteilcorso.poligono;

public abstract class Poligono {
	private int lati;

	public abstract void area();

	public abstract void perimetro();

	public int getLati() {
		return lati;
	}

	public void setLati(int lati) {
		if (lati >= 3) {
			this.lati = lati;
		}
	}
}
