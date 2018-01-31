package eserciziduranteilcorso.poligono;

import static org.junit.Assert.*;

import org.junit.Test;

public class PoligonoTest {

	@Test
	public void testPerimetro(){
		Triangolo t1 = new Triangolo();
		
		int [] lato = new int[] {1,2,3};
		
		t1.setLati(lato);
		
		assert(t1.perimetro() == 6);
		
	}


	
}
