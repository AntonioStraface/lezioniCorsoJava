package eserciziduranteilcorso.collezionista.model;

public class Cd extends Supporto{
	
	public static final TipiSupporto supporto = TipiSupporto.CD ; 
	
	public Cd(Album album) {
		super(album,supporto);
	}

}
