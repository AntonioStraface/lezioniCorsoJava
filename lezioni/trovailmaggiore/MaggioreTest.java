package lezioni.trovailmaggiore;

import static org.junit.Assert.*;

import org.junit.Test;


public class MaggioreTest {
	
	public void init (int [] array, int numTest ) {
		TrovaIlMaggioreTraNnum tm = new TrovaIlMaggioreTraNnum(array);
		assert (tm.search() == numTest);
	
	}

	@Test
	public void trovaIlMaggioreTraDueNumeri() {
		int [] array = {1,2};
		init (array, 2);
		
	}
	
	@Test
	public void trovaIlMaggioreTraTreNumeri () {
		int [] array = {1,2,7};
		init (array,7);
	}
	
	@Test
	public void trovaIlMaggioreTraTreNumeriNegativi () {
		int [] array = {-1,-2,-7};
		init (array,-1);
	}
	@Test
	public void trovaIlMaggioreTraTreNumeriNegativi_1 () {
		int [] array = {0,-66000,999999999,-0};
		init (array,999999999);
	}
	
	

}
