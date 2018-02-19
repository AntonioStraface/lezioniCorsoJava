package eserciziduranteilcorso.collezionista.model;

public class Cantante extends Artista {
	
	public static final Lavoro lAVORO = Lavoro.Cantante ; 

	
	public Cantante (String nome, String cognome, int eta,int anniDesperienza) {
		super(nome,cognome,eta,anniDesperienza);
	}

}
