package eserciziduranteilcorso.collezionista.model.artista;

import eserciziduranteilcorso.collezionista.enums.Lavoro;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Artista;

public class Attore  extends Artista {
	
	public static final Lavoro lAVORO = Lavoro.Attore ; 

	public Attore (String nome, String cognome, int eta,int anniDesperienza) {
		super(nome,cognome,eta,anniDesperienza);

	}


	@Override
	public String getLavoro() {
		// TODO Auto-generated method stub
		return Lavoro.Attore.toString();
	}

}