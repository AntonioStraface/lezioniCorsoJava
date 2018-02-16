package eserciziduranteilcorso.Ristorante.File;

public class Pietanza {

	private String nome, descrizione;
	private double costo;
	private Portata portata;
	
	public Pietanza(String n, String d, double c, Portata p) {
		this.nome = n;
		this.descrizione = d;
		this.costo = c;
		this.portata = p;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public Portata getPortata() {
		return portata;
	}
	
	public void setPortata(Portata portata) {
		this.portata = portata;
	}
	
	@Override
	public String toString() {
		return getNome()+","+getDescrizione()+","+getCosto()+","+getPortata();
	}
	
	@Override
	public boolean equals(Object obj) {
		return toString().equals(obj.toString());
	}
}
