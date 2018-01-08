package collection.set;

import java.util.Set;
import java.util.TreeSet;

class Negozio {

	private Set<Smartphone> smartphones;
	
	public Negozio() {
		smartphones = new TreeSet<Smartphone>();
	}

	public Set<Smartphone> getSmartphones() {
		return smartphones;
	}
	
	public void addSmartphone(Smartphone s) {
		this.smartphones.add(s);
	}
	
	public int getNumeroTelefoni() {
		return this.smartphones.size();
	}
	
}
