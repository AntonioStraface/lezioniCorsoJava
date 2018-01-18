package lezioni.polimorfismo.casting;

class Dipendente {
	private String nome, anniDiEsperienza, stipendio;
	
	public static boolean stipendioVincente(Dipendente dipendenti[]) {		
		for(Dipendente d: dipendenti) {		
			if(d instanceof Commerciale) {			
				Commerciale c = (Commerciale) d;			
				if(c.getPortafoglioClienti().length > 10) {
					return true;
				}
						
			}		
			else if(d instanceof Programmatore) {				
				Programmatore p = (Programmatore) d;				
				if(p.getLinguaggiConosciuti().length > 10) {
					return true;
				}	
			}		
		}
		
		return false;
	}
	
	public static boolean stipendioVincente(Object dipendenti[]) {
		for(Object d: dipendenti) {		
			if(d.getClass().getName().contains(("Commerciale"))) {			
				Commerciale c = (Commerciale) d;			
				if(c.getPortafoglioClienti().length > 10) {
					return true;
				}
						
			}		
			else if(d.getClass().getName().contains(("Programmatore"))) {				
				Programmatore p = (Programmatore) d;				
				if(p.getLinguaggiConosciuti().length > 10) {
					return true;
				}	
			}		
		}
		
		return false;
	}
	
	
	public String getAnniDiEsperienza() {
		return anniDiEsperienza;
	}

	public void setAnniDiEsperienza(String anniDiEsperienza) {
		this.anniDiEsperienza = anniDiEsperienza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStipendio() {
		return stipendio;
	}

	public void setStipendio(String stipendio) {
		this.stipendio = stipendio;
	}
	
}
