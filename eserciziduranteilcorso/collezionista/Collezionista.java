package eserciziduranteilcorso.collezionista;

import java.util.*;

import eserciziduranteilcorso.collezionista.model.artista.Attore;
import eserciziduranteilcorso.collezionista.model.artista.Cantante;
import eserciziduranteilcorso.collezionista.model.artista.Regista;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Artista;
import eserciziduranteilcorso.collezionista.model.classi_abstract.Media;
import eserciziduranteilcorso.collezionista.model.media.*;
import java.lang.reflect.*;

public class Collezionista {
	
	private Map<String, LinkedList<Media>> collezione;
	private String[] identita;
	private int[] dataDiNascita;
	
	public Collezionista() {
		
		collezione = new HashMap<String, LinkedList<Media>>();
		collezione.put("films", new LinkedList<Media>());
		collezione.put("albums", new LinkedList<Media>());
		
		identita = new String[3];
		dataDiNascita = new int[3];
	}
	
	public Collezionista(String[] identita, int[] dataDiNascita) {
		
		collezione = new HashMap<String, LinkedList<Media>>();
		collezione.put("films", new LinkedList<Media>());
		collezione.put("albums", new LinkedList<Media>());
		
		setIdentita(identita);
		setDataDiNascita(dataDiNascita);
	}

	public HashMap<String, LinkedList<Media>> getCollezione() {
		
		return (HashMap<String, LinkedList<Media>>) collezione;
	}

	public void setCollezione(HashMap<String, LinkedList<Media>> collezione) {
		
		this.collezione = collezione;
	}

	public String[] getIdentita() {
		
		return identita;
	}

	public void setIdentita(String[] identita) {
		
		this.identita = identita;
	}

	public int[] getDataDiNascita() {
		
		return dataDiNascita;
	}

	public void setDataDiNascita(int[] dataDiNascita) {
		
		this.dataDiNascita = dataDiNascita;
	}
	
	public void putMediaToCollection(Media media) {
		
		collezione.get(
				checkMediaType(media)
		).add(media);
	}
	
	public Media searchMedia(Media media) {
		
		String mediaType = checkMediaType(media);
		
		Iterator<Media> i = collezione.get(mediaType).iterator();
		
		while(i.hasNext()) {
			
			Media temp = i.next();
			
			if(temp.equals(media)) return temp;
		}
		
		return null;
	}
	
	private String checkMediaType(Media media) {
		
		String mediaType = null;
		
		if(media instanceof Film)		mediaType = "films";
		else if(media instanceof Album)	mediaType = "albums";
		
		return mediaType;
	}
	
	public LinkedList<Media> trovaMediaFromArtista(Artista artista){
		String mediaType = returnTipo(artista);
		LinkedList<Media> filmReg = new LinkedList<Media>();
		Iterator<Media> iter = collezione.get(mediaType).iterator();
		while(iter.hasNext()) {
			Media tmp = iter.next();
			Iterator<Artista> it = tmp.getListaArtisti().iterator();
			while(it.hasNext()) {
				Artista cont= it.next();
				if(cont.equals(artista)) {
					filmReg.add(tmp);
				}
			}
		}
		return filmReg;
	}
	
	public String returnTipo (Artista artista) {
		if((artista instanceof Regista) || (artista instanceof Attore))
			return "films";
		if(artista instanceof Cantante)
			return "albums";
		return null;
	}
	
}
