package lezioni.classi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudente {
	
	Studente ciccio;
	
	public void testScuola(int eta, String scuola) {	
		ciccio = new Studente("debora", "bruno", eta, "via Carracci");
		assert(ciccio.getTitoloStudio().equals(scuola));
	}
	
	private void testMatricola(int matricola,int value) {
		ciccio= new Studente("adsfdsf", "akfjnbbadifb", 10, "asdsad");
		ciccio.setMatricola(matricola);
		assert(ciccio.getMatricola()==value);
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
	
	@Test
	public void testMatricolaVerificata() {
		testMatricola(1000,1000);
	}
	
	@Test
	public void testMatricolaErrata() {
		testMatricola(100000000,-1);
	}
	
}
