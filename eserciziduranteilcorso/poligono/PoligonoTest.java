package eserciziduranteilcorso.poligono;

import static org.junit.Assert.*;

import org.junit.Test;

public class PoligonoTest {

	@Test
	// test 3 lati
	public void test3lati() {
		Triangolo pl = new Triangolo();
		pl.setLati(3);
		assert (pl.getLati() == 3);
	}

	@Test
	// test 2 lati
	public void test2lati() {
		Triangolo pl2 = new Triangolo();
		pl2.setLati(2);
		assert (pl2.getLati() == -1);

	}

}
