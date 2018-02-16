package eserciziduranteilcorso.Ristorante;

public class Prenotazione {
	private String nome;
	private int numeroPersone;
	
	public Prenotazione(Ristorante ristorante , String nome, int numeroPersone) {
		setNome(nome);
		setNumero(numeroPersone);
	}

	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numeroPersone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}  
	
	public void setNumero(int numero) {
		this.numeroPersone = numero;
	}
	
	public boolean equals (Prenotazione prenotazione2) {
		
		return ((nome == prenotazione2.getNome()) && (numeroPersone == prenotazione2.getNumero())); 
	}
	
}
