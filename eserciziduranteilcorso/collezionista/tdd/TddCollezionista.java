package eserciziduranteilcorso.collezionista.tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import eserciziduranteilcorso.collezionista.model.*;

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

}
