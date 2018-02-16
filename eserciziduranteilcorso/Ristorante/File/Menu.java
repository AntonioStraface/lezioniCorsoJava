package eserciziduranteilcorso.Ristorante.File;

import java.util.Iterator;
import java.util.LinkedList;

public class Menu {

	private LinkedList<Pietanza> pietanze;
	
	public Menu() {
		
		pietanze = new LinkedList<Pietanza>();
	}
	
	public LinkedList<Pietanza> getPietanze() {
		return pietanze;
	}
	
	public Pietanza getPietanzaByNome(String n) {
		LinkedList<Pietanza> p = getPietanze();
		
		Iterator<Pietanza> ip = p.iterator();
		while(ip.hasNext()) {
			String s = ip.next().getNome();
			if(!s.equals(n)) {
				ip.remove();
			}
		}
		
		return p.getFirst();
	}
	
	public void addPietanza(Pietanza p) {
		this.pietanze.add(p);
	}
	
}

