package lezioni.classi;

class Persona {
	// Attributi
	private String nome, cognome, cf;
	private int eta;

	public Persona() {
		nome = "";
		cognome = "";
		eta = 0;
	}

	public Persona(String nome, String cognome, int eta, String cf) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setEta(eta);
		this.setCF(cf);
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
	
	public String getCF() {
		return cf;
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
	
	public void setCF(String cf) {
		this.cf = cf;
	}
	

	
	@Override
	public String toString() {
	 	String valore = "nome: " + this.getNome() + " cognome: " + this.getCognome() + " età: " + this.getEta() + " cf: " + this.getCF();
	 	return valore;	
	}
	
	
}
