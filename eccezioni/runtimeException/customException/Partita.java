package eccezioni.runtimeException.customException;

class Partita {

	public void setPartita(int giornata,String... squadre) throws NumeroGiornateErrate {
		if(giornata == 0) {
			throw new NumeroGiornateErrate("from Partita", giornata);
		} 
	} 
}
