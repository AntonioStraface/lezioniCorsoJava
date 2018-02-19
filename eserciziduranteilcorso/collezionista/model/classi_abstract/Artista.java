package eserciziduranteilcorso.collezionista.model.classi_abstract;

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
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Artista) {
			Artista test = (Artista) obj;
			if (test.getNome().equals(this.getNome()) && test.getCognome().equals(this.getCognome())) {
				return true;
			}
			return false;
		}
		else return false;
	}
}
