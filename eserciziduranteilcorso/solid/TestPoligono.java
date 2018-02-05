package eserciziduranteilcorso.solid;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPoligono {

	@Test
	public void testAreaRettangolo() {
		Rettangolo r = new Rettangolo(3, 5);
		
		assert(r.calcolaArea() == 15);
	}
	
	@Test
	public void testAreaPoligono() {
		Poligono r = new Rettangolo(3, 5);
		
		assert(r.calcolaArea() == 15);
	}
	
	@Test
	public void testAreaQuadrato() {
		Poligono q = new Quadrato(5);
		
		assert(q.calcolaArea() == 25);
	}

}
