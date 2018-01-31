package eserciziduranteilcorso.poligono;

public abstract class Poligono {
	
	private int [] lati;
	
	public abstract void area();
	
	public int [] getLati() {
		return lati;
	}

	public void setLati(int [] lati) {
		this.lati=lati;
	}
	
	public int perimetro() {
		int somma = 0;
		for(int i = 0; i< lati.length; i++) {
			somma += lati[i];
		}
		return somma;
	}
}
