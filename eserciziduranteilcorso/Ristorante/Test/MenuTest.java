package eserciziduranteilcorso.Ristorante.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import eserciziduranteilcorso.Ristorante.File.Menu;
import eserciziduranteilcorso.Ristorante.File.Pietanza;
import eserciziduranteilcorso.Ristorante.File.Portata;

public class MenuTest {

	@Test
	public void test() {
		Menu m = new Menu();
		
		m.addPietanza(new Pietanza("Carbonara","passta con uovo, pancetta e parmiggiano",5.0,Portata.PRIMO));
		m.addPietanza(new Pietanza("Pasta al ragù","Pasta con ragù alla bolognese",5.0,Portata.PRIMO));
		m.addPietanza(new Pietanza("Pizza salsiccia","Pizza conj salsiccia DOP",5.0,Portata.PIZZE));
		m.addPietanza(new Pietanza("Acqua naturale 1l","",1.0,Portata.BIBITE));
		m.addPietanza(new Pietanza("Profiterol","Bighe al cioccolato immersi nel cioccolato",5.0,Portata.DOLCE));
		
		assert(m.getPietanzaByNome("Pasta al ragù").getNome().equals("Pasta al ragù"));
	}

}
