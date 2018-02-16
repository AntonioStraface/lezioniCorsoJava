package eserciziduranteilcorso.Ristorante.File;

public class Cliente extends Persona {

	private double conto;
	private Prenotazione prenotazione;
	
	public Cliente ( String nome, int conto) {
		super(nome);
		this.conto = conto;
	}
	
	public void prenotaTavolo (Ristorante ristorante , int numeroPersone) {
		prenotazione = new Prenotazione (ristorante ,super.getNome(), numeroPersone);
	}
	
	public Prenotazione getPrenotazione () {
		return prenotazione;
	}
}
