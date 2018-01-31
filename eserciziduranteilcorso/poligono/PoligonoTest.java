package eserciziduranteilcorso.poligono;

import static org.junit.Assert.*;

import org.junit.Test;

public class PoligonoTest {

	@Test
	public void testPerimetro(){
		
		Triangolo t1 = new Triangolo();
		
		int [] lati = new int[] {1,2,3};
		
		t1.setLati(lati);
		
		assert(t1.perimetro() == 6);
		
	}
	
	@Test
	public void testPerimetroRettangolo() {
		
		Rettangolo r1 = new Rettangolo();
		int [] lati1 = new int[] {2,4,2,4};
		r1.setLati(lati1);
		assert(r1.perimetro() == 12);
		
		
	}
	
	@Test
	public void testAreaTriangolo() {
		Triangolo tr1 = new Triangolo();
		int [] lati2 = new int[] {2, 2, 2};
		tr1.setLati(lati2);
		assert(tr1.area() == Math.sqrt(3));
	}


	
}
