package eserciziduranteilcorso.poligono;

public class Triangolo extends Poligono {
	public final static int nlati = 3;
	
	public Triangolo() {	
		super.setLati(new int [nlati]);
	}
		
	@Override
	public double area() {
		double semiPerimetro = (super.perimetro())/2;
		double areaT = 0;
		int [] lato = super.getLati();
		double termine = 1;              
		for(int i = 0; i< lato.length; i++) {
			termine *= (semiPerimetro - lato[i]);
		}
		areaT = Math.sqrt(semiPerimetro*termine);	
		return areaT;
	}
}
