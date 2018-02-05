package eserciziduranteilcorso.solid;

public class Rettangolo extends Poligono {

	public Rettangolo() {
		super(4);
	}

	public Rettangolo(int base, int altezza) {
		super(new int[] { base, altezza, base, altezza });
	}

	@Override
	public double calcolaArea() {

		return lati[0] * lati[1];
	}
}
