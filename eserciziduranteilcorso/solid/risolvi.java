package eserciziduranteilcorso.solid;

public class Risolvi {

	
	public static double areaFigura(String figura,int base,int basedue,int altezza) {
		
		double area = 0;
		
		if(figura.compareTo("rettangolo") == 0) {
			area = base * altezza;
		}
		if(figura.compareTo("triangolo") == 0) {
			area = (base * altezza)/2;
		}
		if(figura.compareTo("trapezio") == 0) {
			area = ((base + base) * altezza)/2;
		}
		
		
		return area;
	}
}
