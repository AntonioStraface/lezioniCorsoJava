package eserciziduranteilcorso.Ristorante.File;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ristorante {

	private LinkedList<Prenotazione> prenotati;
	private ArrayList<Tavolo> tavoli;
	private int tavoliDisponibili, tavoloOccupato,tavoliTotali;
	private int idTavolo;
	
	public Ristorante(int tavoliTotali) {
		prenotati = new LinkedList<Prenotazione>();
		tavoli = new ArrayList<Tavolo>(tavoliTotali);
		tavoliDisponibili = tavoliTotali;
		this.tavoliTotali = tavoliTotali;
		tavoloOccupato = 0;
		idTavolo = 0;
	}
	
	
	public void aggiungiPrenotazione(Prenotazione prenotazione) {
		
			prenotati.add(prenotazione);
	}
	
	public int controlloTavoli (int numeroPosti) {
		for (int i = 0; i < tavoli.size(); i++) {
			if (!(tavoli.get(i).getOccupazione())  && (tavoli.get(i).getNumeroPosti() == numeroPosti)){
				return i;
			}
		}
		return -1;
	}
	
	public void prenotaTavolo(Cliente cliente) {
		int tavoloCorrente = controlloTavoli(cliente.getPrenotazione().getNumero());
		if (tavoloCorrente != -1) {
			if(tavoliDisponibili !=0) {
				tavoliDisponibili --;
				aggiungiPrenotazione(cliente.getPrenotazione());
				tavoli.get(tavoloCorrente).setOccupazione(true);
			}
		}
		
		else {
			System.out.println("Mi dispiace , il tavolo non è disponibile");
		}
	}
	
	public int controlloTavoliLiberi (int numeroPosti) {
		for (int i = 0; i < tavoli.size(); i++) {
			if (!(tavoli.get(i).getOccupazione()) && (tavoli.get(i).getNumeroPosti() == numeroPosti)){
				return i;
			}
		}
		return -1;
	}
	
	public void vaiAlRistorante (Cliente cliente, int numeroPosti) {
		if (cliente.getPrenotazione() != null) {
			for (int i = 0; i < prenotati.size(); i++) {
				if(prenotati.get(i).equals(cliente.getPrenotazione())) {
					System.out.println("Entri pure.");
					break;
				}
			}
			System.out.println("Vai a prendere in giro qualcun'altro . ");
		}
		else {
			int tavoloLibero = controlloTavoliLiberi(numeroPosti);
			if (tavoloLibero != -1) {
				tavoli.get(tavoloLibero).setOccupazione(true);
			}
		}
	}
	
	public void generazioneTavoli () {
		
		for (int i = 0; i < tavoliTotali-4; i++) {
			tavoli.add(new Tavolo(idTavolo , 1 ));
			idTavolo++;
		}
		for (int i = tavoliTotali-4; i < tavoliTotali; i++) {
			tavoli.add(new Tavolo(idTavolo , 2 ));
			idTavolo++;
		}
	}
	public Tavolo getTavolo (int numTavolo) {
		return tavoli.get(numTavolo);
	}
	

	
	
}
