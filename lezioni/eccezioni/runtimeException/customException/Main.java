package lezioni.eccezioni.runtimeException.customException;

 public class Main {

	 public static void main (String[] args) { 
		Campionato c = new Campionato();
		Partita p = new Partita();
		try {
			c.setNumeroGiornate(1);
			p.setPartita(0, "Juve", "Cagliari");
		} catch (NumeroGiornateErrate e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
