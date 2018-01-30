package trovaVocaleMaggiore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVocale {

	String testo = "ciaoo";
	VocaleRipetuta search = new VocaleRipetuta(testo);
	
	public void testVocale(char vocale, int occorrenze) {
		int vocaleTrovata [] = search.trovaVocale();
		int indice = -1;
		switch(vocale) {
			case 'a':
				indice = 0;
			break;
			case 'e':
				indice = 1;
			break;
			case 'i':
				indice = 2;
			break;
			case 'o':
				indice = 3;
			break;
			case 'u':
				indice = 4;
			break;	
		}
	
		assert(vocaleTrovata[indice] == occorrenze );
		
	}
	
	@Test
	public void testSuVocaleA() {
		testVocale('o', 2);
		
	}

	@Test
	public void testSuVocaleU() {
		testVocale('u', 0);
	}
	
	@Test
	public void numOcc() {
		assert(search.maggioreVocale()=='o');
	}
}
