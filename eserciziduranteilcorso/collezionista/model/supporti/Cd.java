package eserciziduranteilcorso.collezionista.model.supporti;

import eserciziduranteilcorso.collezionista.enums.TipiSupporto;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Supporto;
import eserciziduranteilcorso.collezionista.model.media.Album;

public class Cd extends Supporto{
	
	public static final TipiSupporto supporto = TipiSupporto.CD ; 
	
	public Cd(Album album) {
		super(album,supporto);
	}

}
