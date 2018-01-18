package lezioni.principiDiProgrammazione.questo;

class Cliente {

	private String nome,cognome,indirizzo;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public Cliente(String nome, String cognome) {
		this(nome, cognome, "non specificato");
	}
	
	public Cliente(String nome, String cognome, String indirizzo)  {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.cognome + " " + this.indirizzo;
		
	}
	
}
