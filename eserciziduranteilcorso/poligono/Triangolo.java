package eserciziduranteilcorso.poligono;

public class Triangolo extends Poligono {
	public final static int nlati = 3;
	int [] lati;
	
	public Triangolo() {
		lati = new int [nlati];
	}
	

	@Override
	public void area() {
		
		// TODO Auto-generated method stub

	}
	
	public void setLati(int [] lati) {
		this.lati=lati;
	}

	@Override
	public int perimetro() {
		int somma = 0;
		for(int i = 0; i< lati.length; i++) {
			somma += lati[i];
		}
		return somma;
	}
	
	

	
}
