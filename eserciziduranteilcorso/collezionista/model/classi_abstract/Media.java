package eserciziduranteilcorso.collezionista.model.classi_abstract;

import java.util.Iterator;
import java.util.LinkedList;

import eserciziduranteilcorso.Collection.Alunno;

public abstract class Media {
	
	private String titolo, genere, tipoMedia;
	private int anno;
	private LinkedList<Artista> listaArtisti;
	
	public Media(String titolo, String genere, int anno, String tipoMedia) {
		listaArtisti = new LinkedList<Artista>();
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
	public boolean equals(Object obj) {

		Media temp = (Media) obj;
		
		return titolo.equals(temp.getTitolo())
			&& genere.equals(temp.getGenere())
			&& tipoMedia.equals(temp.getTipoMedia())
			&& anno == temp.getAnno();
	}
	
	@Override
	public String toString() {
		return "MEDIA: "+tipoMedia+"\n TITOLO: "+titolo+"\n GENERE: "+genere+"\n ANNO: "+anno;
	}

	public LinkedList<Artista> getListaArtisti() {
		return listaArtisti;
	}

	public void setListaArtisti(LinkedList<Artista> listaArtisti) {
		this.listaArtisti = listaArtisti;
	}
	
	public Boolean checkArtista(Artista artista) {
		Iterator<Artista> iterator = getListaArtisti().iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().equals(artista)) return true;	
		}
		return false;
	}
	
	public void addArtista(Artista artista) {
		listaArtisti.add(artista);
	}
}
