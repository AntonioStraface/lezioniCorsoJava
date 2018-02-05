package eserciziduranteilcorso.solid;

public class Poligono implements InterfacePoligono {

	protected int[] lati;
	
	public Poligono(int numLati) {
		this.lati = new int[numLati];
	}
	
	public Poligono(int[] lati) {
		this.lati = lati;
	}
	
	public int[] getLati() {
		return lati;
	}
	
	public double calcolaArea() {

		return -1;
	}
}
