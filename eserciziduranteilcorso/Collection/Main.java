package eserciziduranteilcorso.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Collection<Alunno> scuola = new HashSet<Alunno>();
		
		Alunno p1 = new Alunno("Debora", 18);
		Alunno p2 = new Alunno("Lai", 14);
		Alunno p3 = new Alunno("Marcello", 8);
		Alunno p4 = new Alunno("Antonio", 12);
		Alunno eliminami = new Alunno("Antonio", 12);
		
		scuola.add(p1);
		scuola.add(p2);
		scuola.add(p3);
		scuola.add(p4);
		
		Iterator<Alunno> iterator = scuola.iterator();
		
		while(iterator.hasNext()) {
			Alunno current = iterator.next();
			if(current.equals(eliminami)) {
				iterator.remove();
			}
		}
	}

}
