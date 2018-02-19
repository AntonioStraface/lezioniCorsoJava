package eserciziduranteilcorso.collezionista.model.supporti;

import eserciziduranteilcorso.collezionista.enums.TipiSupporto;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Media;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Supporto;

public class Dvd extends Supporto{

	public static final TipiSupporto supporto = TipiSupporto.DVD ; 
	
	public Dvd(Media media) {
		super(media,supporto);
	}
}
