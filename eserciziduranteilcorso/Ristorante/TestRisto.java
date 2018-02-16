package eserciziduranteilcorso.Ristorante;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestRisto {

	
	@Test
	public void testGenerazioneTavoli() {
		Ristorante daNino = new Ristorante (20);
		daNino.generazioneTavoli();
		assert(daNino.getTavolo(3).getNumero() == 3);
	}
	
	@Test
	public void testPrenotazione() {
		Ristorante daNino = new Ristorante (20);
		daNino.generazioneTavoli();
		Cliente nino = new Cliente ("Nino",500);
		nino.prenotaTavolo(daNino, 1);
		daNino.prenotaTavolo(nino);
		assert(daNino.getTavolo(0).getOccupazione() == true);
	}
	
	@Test
	public void testVaiAlRistorante() {
		Ristorante daNino = new Ristorante (20);
		daNino.generazioneTavoli();
		Cliente nino = new Cliente ("Nino",500);
		nino.prenotaTavolo(daNino, 1);
		daNino.prenotaTavolo(nino);
		assert(daNino.getTavolo(0).getOccupazione() == true);
	}
	
	@Test
	public void testVaiAlRistoranteSenzaPrenotazione() {
		Ristorante daNino = new Ristorante (20);
		daNino.generazioneTavoli();
		Cliente nino = new Cliente ("Nino",500);
		daNino.vaiAlRistorante(nino, 2);
		assert(daNino.getTavolo(16).getOccupazione() == true);
	}
	


}
