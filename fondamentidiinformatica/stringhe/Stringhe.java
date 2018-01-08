package fondamentidiinformatica.stringhe;

public class Stringhe {
	
	public static int occorrenze(String parola, char a) {
		int occorrenze = 0;
		for(int i =0; i<parola.length(); i++) {
			if(parola.charAt(i) == a) {
				occorrenze ++;
			} 
		}	
		return occorrenze;
	}
}
