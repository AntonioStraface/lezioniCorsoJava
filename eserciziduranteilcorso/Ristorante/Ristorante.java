package eserciziduranteilcorso.Ristorante;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ristorante {

	private LinkedList<Prenotazione> prenotati;
	private ArrayList<Tavolo> tavoli;
	private int tavoliDisponibili, tavoloOccupato;
	
	public Ristorante(int tavoliTotali) {
		prenotati = new LinkedList<Prenotazione>();
		tavoli = new ArrayList<Tavolo>(tavoliTotali);
		tavoliDisponibili = tavoliTotali;
	}
	
	
	public void aggiungiPrenotazione(Prenotazione... persone) {
		for(Prenotazione tmp: persone) {
			prenotati.add(tmp);
		}
	}
	
	public void prenotaTavolo(Prenotazione... persone) {
		tavoloOccupato = 1;
		if(tavoliDisponibili !=0) {
			tavoliDisponibili -= tavoloOccupato;
			aggiungiPrenotazione(persone);
		}
		else {
			System.out.println("");
		}
	}
	
}
