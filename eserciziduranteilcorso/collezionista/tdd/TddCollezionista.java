package eserciziduranteilcorso.collezionista.tdd;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Test;

import eserciziduranteilcorso.collezionista.model.artista.*;
import eserciziduranteilcorso.collezionista.model.classi_abstract.*;
import eserciziduranteilcorso.collezionista.model.media.*;
import eserciziduranteilcorso.collezionista.model.supporti.*;

public class TddCollezionista {

	Film f;
	Album a;
	
	private void initFilm(String titolo, String genere, int anno) {
		f = new Film(titolo, genere, anno);
	}
	
	private void initAlbum(String titolo, String genere,int anno) {
		a = new Album(titolo, genere, anno);
	}

	@Test
	public void testFilmCreazione() {
	initFilm("dijfh", "horror", -1994);
		assert(f.getAnno() == 1994);
	}
	
	@Test
	public void testAttore() {
	Attore williSmith = new Attore("Willi","Smith",30,29);
	assert(williSmith.getEta() == 30);
	}
	
	@Test
	public void testSupportoFilm() {
	Film memento = new Film("Memento","thriller",2008);
	BluRay bluray = new BluRay(memento);
	assert(bluray.getM().getTitolo().equals("Memento"));
	}
	
	@Test
	public void testListaArtisti() {
	Film memento = new Film("Memento","thriller",2008);
	Attore williSmith = new Attore("Willi","Smith",30,29);
	Regista nolan = new Regista("giorgio", "Nolan", 70,50);
	LinkedList<Artista> lista = new LinkedList<>();
	lista.add(nolan);
//	lista.add(williSmith);
	
	memento.setListaArtisti(lista);
	
	assert(!memento.checkArtista(williSmith));
	}

}
