package eserciziduranteilcorso.collezionista.model.supporti;

import eserciziduranteilcorso.collezionista.enums.TipiSupporto;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Supporto;
import eserciziduranteilcorso.collezionista.model.media.Film;

public class BluRay extends Supporto{

	public static final TipiSupporto supporto = TipiSupporto.BLURAY ; 
	
	public BluRay(Film film) {
		super(film,supporto);
	}
}
