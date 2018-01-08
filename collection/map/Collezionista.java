package collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Collezionista {

	public Map<String,Regista> raccolta;
	
	public Collezionista() {
		raccolta = new TreeMap<String,Regista>();
	}
	
	public void aggiungiAcatalogo(Regista r) {
		this.raccolta.put(r.getNome(), r);
	}
	
	public Regista prendiDaCatalogo(Regista r) {
		return this.raccolta.get(r.getNome());
	}
	
	@Override
	public String toString() {	
		String toString = "";
		Iterator<Entry<String, Regista>> iterator = raccolta.entrySet().iterator();	
		while(iterator.hasNext()) {
			Map.Entry<String,Regista> entry = (Map.Entry<String,Regista>) iterator.next();
			Regista r = (Regista)entry.getValue();
			Iterator<Film> i2 = r.getFilmografia().iterator();
			while(i2.hasNext()) {
				Film f = (Film) i2.next();
				toString += "\n" + entry.getKey().toString() + " " + f.getTitolo().toString();
			} 
		}
		
		return toString;
	}
}
