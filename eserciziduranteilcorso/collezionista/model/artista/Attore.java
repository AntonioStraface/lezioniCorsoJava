package eserciziduranteilcorso.collezionista.model.artista;

import eserciziduranteilcorso.collezionista.enums.Lavoro;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Artista;

public class Attore  extends Artista {
	
	public Attore (String nome, String cognome, int eta,int anniDesperienza) {
		super(nome,cognome,eta,anniDesperienza,Lavoro.Attore.toString());
	}

}
