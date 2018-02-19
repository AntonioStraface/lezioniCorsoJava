package eserciziduranteilcorso.collezionista.model;

public class Album extends Media {

	public static final String TIPOMEDIA = "album"; 
	
	
	public Album(String titolo, String genere, int anno) {
		super(titolo, genere, anno, TIPOMEDIA);
	}

}
