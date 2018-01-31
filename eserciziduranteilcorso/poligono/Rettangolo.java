package eserciziduranteilcorso.poligono;

public class Rettangolo extends Poligono {

	public final static int nlati = 4;

	public Rettangolo() {
		int[] lati = super.getLati();
		lati = new int[nlati];
	}

	@Override
	public double area() {
		int[] lati = super.getLati();
		int base = lati[0];
		int altezza = lati[1];	
		return base*altezza;
		

		// TODO Auto-generated method stub

	}

}
