package eserciziduranteilcorso.collezionista.model;

public class Dvd extends Supporto{

	public static final TipiSupporto supporto = TipiSupporto.DVD ; 
	
	public Dvd(Media media) {
		super(media,supporto);
	}
}
