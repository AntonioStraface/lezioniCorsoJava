package eserciziduranteilcorso.collezionista.model.media;

import eserciziduranteilcorso.collezionista.model.classi_abstract.Media;

public class Film extends Media {
	
	public static final String TIPOMEDIA = "film"; 

	
	public Film(String titolo, String genere, int anno) {
		super(titolo, genere, anno, TIPOMEDIA);
	}

}
