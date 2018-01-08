package polimorfismo.casting;

class Programmatore extends Dipendente {

	private String [] linguaggiConosciuti;
	
	public Programmatore() {
		linguaggiConosciuti = new String[11];
	}

	public String [] getLinguaggiConosciuti() {
		return linguaggiConosciuti;
	}

	public void setLinguaggiConosciuti(String [] linguaggiConosciuti) {
		this.linguaggiConosciuti = linguaggiConosciuti;
	}
}
