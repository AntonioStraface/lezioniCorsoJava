package eserciziduranteilcorso.collezionista.model.classi_abstract;

public abstract class Artista {

	private String nome, cognome, lavoro;
	private int eta, anniDesperienza;
	
	public Artista (String nome, String cognome, int eta,int anniDesperienza, String lavoro) {
		setNome(nome);
		setCognome(cognome);
		setEta(eta);
		setAnniDesperienza(anniDesperienza);
		setLavoro(lavoro);
	}
	
	private void setLavoro(String lavoro) {
		this.lavoro = lavoro;
	}
	
	
	public String getLavoro() {
		return this.lavoro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getAnniDesperienza() {
		return anniDesperienza;
	}

	public void setAnniDesperienza(int anniDesperienza) {
		this.anniDesperienza = anniDesperienza;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Artista) {
			Artista test = (Artista) obj;
			return test.getNome().equals(this.getNome()) 
				&& test.getCognome().equals(this.getCognome())
				&& test.getLavoro().equals(this.getLavoro());
		}
		else return false;
	}
	

}
