package lezioni.classi;

class Persona {
	// Attributi
	String nome, cognome;
	int eta;

	public Persona() {
		nome = "";
		cognome = "";
		eta = 0;
	}

	public Persona(String n, String cn, int et) {
		nome = n;
		cognome = cn;
		eta = et;
	}
}
