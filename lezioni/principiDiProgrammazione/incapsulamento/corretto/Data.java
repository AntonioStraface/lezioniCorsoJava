package lezioni.principiDiProgrammazione.incapsulamento.corretto;

class Data {
	private int giorno;
	private int mese;
	private int anno;
	
	public int getGiorno() {
		return giorno;
	}
	
	public void setGiorno(int giorno) {
		if(giorno > 0 && giorno <= 31) {
			this.giorno = giorno;
		}	
		else {
			System.out.println("aiaiaiai");
		}
	}
	
	public int getMese() {
		return mese;		
	}
	
	public void setMese(int mese) {
		if(mese > 0 && mese <= 31) {
			this.mese = mese;
		}	
		else {
			System.out.println("aiaiaiai");
		}
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
}



