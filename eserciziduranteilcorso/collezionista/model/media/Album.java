package eserciziduranteilcorso.collezionista.model.media;

import eserciziduranteilcorso.collezionista.model.classi_abstract.Media;

public class Album extends Media {

	public static final String TIPOMEDIA = "album"; 
	
	
	public Album(String titolo, String genere, int anno) {
		super(titolo, genere, anno, TIPOMEDIA);
	}

}
