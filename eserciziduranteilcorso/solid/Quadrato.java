package eserciziduranteilcorso.solid;

public class Quadrato extends Poligono {

	public Quadrato() {
		super(4);
	}

	public Quadrato(int lato) {
		super(new int[] { lato, lato, lato, lato });
	}

	@Override
	public double calcolaArea() {

		return lati[0] * lati[1];
	}
}
