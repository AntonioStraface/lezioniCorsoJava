package eserciziduranteilcorso.Collection;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;

public class TestCollection {
	
	Scuola aldini = new Scuola();
	
	Alunno p1 = new Alunno("Debora", 18);
	Alunno p2 = new Alunno("Lai", 14);
	Alunno p3 = new Alunno("Marcello", 8);
	Alunno p4 = new Alunno("Antonio", 12);
	Alunno eliminami = new Alunno("Antonio", 12);

	
	@Test
	public void testAggiunta() {
		
		aldini.aggiungiAlunno(p1,p2,p3,p4);
		assert(aldini.getAlunnoDaNome("Antonio") == p4);
		
	}
	
	@Test
	public void testRimozione() {
		
		aldini.aggiungiAlunno(p1,p2,p3,p4);
		aldini.eliminaAlunno(eliminami);
		assert(aldini.getAlunnoDaNome("Antonio") == null);
		
	}


}
