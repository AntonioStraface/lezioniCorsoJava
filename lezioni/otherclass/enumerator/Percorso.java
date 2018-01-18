package lezioni.otherclass.enumerator;

public class Percorso {

	public static String indicaIlPercorso(Coordinate c) {
		String result = "";
		switch (c) {
		case NORD:
			result = "vai dritto";
			break;
		case SUD:
			result = "girati e torna indietro";
			break;
		case OVEST:
			result = "vai a sinistra";
			break;
		case EST:
			result = "vai a destra";
			break;
		}

		return result;
	}
}
