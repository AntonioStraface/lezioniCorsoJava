package eserciziduranteilcorso.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Scuola {
	
	Collection<Alunno> scuola ;
	Alunno eliminami = new Alunno("Antonio", 12);
	
	
	public Scuola () {
		scuola = new HashSet<Alunno>();
	}
	
	public void aggiungiAlunno (Alunno... studente) {
		
		for (Alunno temp : studente) {
			scuola.add(temp);
		}
		
	}
	
	public void eliminaAlunno (Alunno... studente) {
			
		Iterator<Alunno> iterator = scuola.iterator();
		
			for (Alunno temp : studente) {
				
				while(iterator.hasNext()) {
					Alunno current = iterator.next();
					if(current.equals(eliminami)) {
						iterator.remove();
					}
				}
			}
			
		}
	
	public Alunno getAlunnoDaNome (String nome) {
		
		Iterator<Alunno> iterator = scuola.iterator();
		
			while(iterator.hasNext()) {
				Alunno current = iterator.next();
				if(current.getNome() == nome) {
					return current;
				}
			}
			return null;
		}
		
	}
	
