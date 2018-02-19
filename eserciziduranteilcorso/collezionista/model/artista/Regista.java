package eserciziduranteilcorso.collezionista.model.artista;

import eserciziduranteilcorso.collezionista.enums.Lavoro;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Artista;

public class Regista extends Artista {

	public static final Lavoro lAVORO = Lavoro.Regista ; 

	public Regista (String nome, String cognome, int eta,int anniDesperienza) {
		super(nome,cognome,eta,anniDesperienza);

	}

	@Override
	public String getLavoro() {
		// TODO Auto-generated method stub
		return Lavoro.Regista.toString();
	}
}
