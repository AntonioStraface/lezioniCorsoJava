package lezioni.classi;

class Persona {
	// Attributi
	private String nome, cognome, indirizzo;
	private int eta;

	public Persona() {
		nome = "";
		cognome = "";
		eta = 0;
	}

	public Persona(String nome, String cognome, int eta, String indirizzo) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setEta(eta);
		this.setIndirizzo(indirizzo);
	}
	
	public Persona(String nome, String cognome, int eta) {
		this(nome, cognome, eta, " ");
	}
	
	public String  getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public int  getEta(){
		return eta;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	public void setEta(int eta){
		if(eta>=0 && eta<130){
			this.eta=eta;
		}
	}

	public void setNome(String nome){
    	if(nome.length()>0){
    		this.nome=nome;
    	}
    }
	
	public void setCognome(String cognome){
		if(cognome.length()>0){
			this.cognome=cognome;
		}
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	

	
	@Override
	public String toString() {
		String valore = "nome: " + this.getNome() + " cognome: " + this.getCognome() + " età: " + this.getEta() + " indirizzo: " + this.getIndirizzo();
	 	return valore;	
	}
	

	public boolean equals(Persona individuo1) {
		return (this.nome.equals(individuo1.getNome())
			&& this.cognome.equals(individuo1.getCognome())
			&& this.eta == individuo1.getEta()
			&& this.indirizzo.equals(individuo1.getIndirizzo()));

		
	}
}
