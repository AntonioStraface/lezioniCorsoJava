package eserciziduranteilcorso.collezionista.model;

public abstract class Media {
	
	private String titolo, genere,tipoMedia;
	private int anno;
	
	public Media(String titolo, String genere, int anno, String tipoMedia) {
	
		setTitolo(titolo);
		setGenere(genere);
		setAnno(anno);
		setTipoMedia(tipoMedia);
		
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public void setAnno(int anno) {
		
		if (anno<0) {
			anno*=-1;
			this.anno = anno;
		}
		
		else {
			this.anno = anno;			
		}
		
	}
	
	public String getTipoMedia() {
		return tipoMedia;
	}

	public void setTipoMedia(String tipoMedia) {
		this.tipoMedia = tipoMedia;
	}

	public String getTitolo() {
		return titolo;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public int getAnno() {
		return anno;
	}
	
	@Override
	public String toString() {
		return "MEDIA: "+tipoMedia+"\n TITOLO: "+titolo+"\n GENERE: "+genere+"\n ANNO: "+anno;
	}
	
}
