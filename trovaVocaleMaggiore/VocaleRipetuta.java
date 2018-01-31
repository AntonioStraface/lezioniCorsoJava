package trovaVocaleMaggiore;

public class VocaleRipetuta {

	String testo;
	char [] caratteri;
	
	public VocaleRipetuta(String testo) {
		this.caratteri = new char [] {'a', 'e', 'i', 'o', 'u'};
		setTesto(testo); 
		
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	
	public String getTesto() {
		return testo;
	}
	
	public int [] trovaVocale() {
		int cont [] = new int [caratteri.length];
		for(int i = 0; i < testo.length(); i++) {
			for(int j = 0; j < caratteri.length; j++) {
				if(testo.charAt(i) == caratteri[j]) {
					cont[j]++ ;
				}				
			}
		} return cont;
	
	}
	
	public char maggioreVocale() {
		int max=0, posto=0;
		int[]cont=trovaVocale();
		for (int i=0; i < cont.length; i++) {
			if (max < cont[i]) {
				max = cont[i];
				posto = i;
			}
		}
		return caratteri[posto];
	}
}
