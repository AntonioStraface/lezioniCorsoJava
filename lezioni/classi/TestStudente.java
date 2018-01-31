package lezioni.classi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudente {
	
	public void testScuola(int eta, String scuola) {
		Studente ciccio = new Studente("debora", "bruno", eta, "via Carracci");
		assert(ciccio.getTitoloStudio().equals(scuola));
	}

	@Test
	public void testMaterna() {
		testScuola(4, "materna");
	}
	
	
	@Test
	public void testElementari() {
		testScuola(7, "elementari");
	}

	@Test
	public void testMedie() {
		testScuola(12, "medie");
	}
	
	@Test
	public void testSuperiori() {
		testScuola(18, "superiori");
	}
	
	@Test
	public void testAltro() {
		testScuola(30, "altro");
	}
}
