package eserciziduranteilcorso.collezionista.model;

import java.util.*;

import eserciziduranteilcorso.collezionista.model.classi_abstract.Artista;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Media;

public interface Cast {
	
	public List<Media> trovaArtista(Artista artista);
	
}
