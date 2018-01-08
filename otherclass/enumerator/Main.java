package otherclass.enumerator;

public class Main {

	public static void main(String []args) {
		Coordinate c = Coordinate.EST;
		System.out.println(c.getShortCode());
		System.out.println(Coordinate.valueOf("EST"));		
		System.out.println(Percorso.indicaIlPercorso(c));
	}
}
