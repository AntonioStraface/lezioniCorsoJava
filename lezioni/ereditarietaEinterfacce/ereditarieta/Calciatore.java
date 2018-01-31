package lezioni.ereditarietaEinterfacce.ereditarieta;

public class Calciatore {
	private String nome, cognome, ruolo;

	public Calciatore() {
		System.out.println("Sono un Calciatore");
	}
	
	public Calciatore(String nome,String cognome,String ruolo) {
			
	}
	
	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
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
	
	
}
