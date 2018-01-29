package lezioni.classi;

class Persona {
	// Attributi
	private String nome, cognome;
	private int eta;

	public Persona() {
		nome = "";
		cognome = "";
		eta = 0;
	}

	public Persona(String n, String cn, int et) {
		nome = n;
		cognome = cn;
		eta = et;
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
	
	public void setEta(int a){
		if(a>=0 && a<130){
			eta=a;
		}
	}

	public void setNome(String n){
    	if(n.length()>0){
    		nome=n;
    	}
    }
	
	public void setCognome(String c){
		if(c.length()>0){
			cognome=c;
		}
	}
	
	
}
