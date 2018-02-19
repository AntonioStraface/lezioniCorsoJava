package eserciziduranteilcorso.collezionista.model;

public class BluRay extends Supporto{

	public static final TipiSupporto supporto = TipiSupporto.BLURAY ; 
	
	public BluRay(Film film) {
		super(film,supporto);
	}
}
