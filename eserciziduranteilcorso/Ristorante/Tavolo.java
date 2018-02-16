package eserciziduranteilcorso.Ristorante;

public class Tavolo {
	private int numero, numeroPosti;
	private boolean occupato;
	
	public Tavolo(int numero, int numeroPosti) {
		setNumero(numero);
		setNumeroPosti(numeroPosti);
		occupato = false;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getNumeroPosti() {
		return numeroPosti;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	
	public void setOccupazione (boolean condizione) {
		occupato = condizione;
	}
	
	public boolean getOccupazione () {
		return occupato;
	}
}
