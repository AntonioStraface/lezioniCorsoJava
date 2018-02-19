package eserciziduranteilcorso.collezionista.model.artista;

import eserciziduranteilcorso.collezionista.enums.Lavoro;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Artista;

public class Cantante extends Artista {
	
	public Cantante (String nome, String cognome, int eta,int anniDesperienza) {
		super(nome,cognome,eta,anniDesperienza,Lavoro.Cantante.toString());
	}

}
