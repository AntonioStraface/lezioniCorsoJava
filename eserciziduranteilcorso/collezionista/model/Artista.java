package eserciziduranteilcorso.collezionista.model;

public abstract class  Artista {

	private String nome, cognome;
	private int eta, anniDesperienza;
	
	public Artista (String nome, String cognome, int eta,int anniDesperienza) {
		setNome(nome);
		setCognome(cognome);
		setEta(eta);
		setAnniDesperienza(anniDesperienza);
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
}
