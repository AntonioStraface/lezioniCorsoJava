package lezioni.fondamentidiinformatica.stringhe;

class Main {

	public static void main(String[] args) {
		String parola = "ciccio";
		System.out.println(Stringhe.occorrenze(parola, 'c'));
		
		String parolaBis = "antonio-straface-giovani-e-belli";		
		System.out.println(Stringhe.capitalizeString(parolaBis));
	}

}
