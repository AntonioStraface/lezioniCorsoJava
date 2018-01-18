package lezioni.fondamentidiinformatica.stringhe;

public class Stringhe {
	
	public static int occorrenze(String parola, char lettera) {
		int occorrenze = 0;
		for(int i =0; i<parola.length(); i++) {
			if(parola.charAt(i) == lettera) {
				occorrenze ++;
			} 
		}	
		return occorrenze;
	}
	
	public static String capitalizeString(String frase) {
		final char SEPARATOR = ' ';
		String capitalizeFrase = String.valueOf(Character.toUpperCase(frase.charAt(0)));
		for(int i =0; i<frase.length()-1; i++) {
			char charAdd;
			if(frase.charAt(i) == SEPARATOR) {
				charAdd = Character.toUpperCase(frase.charAt(i +1)); 
			} 
			else {
				charAdd = frase.charAt(i + 1);
			}
			capitalizeFrase += charAdd;			
		}	
		
		return capitalizeFrase;
		
	}
}
