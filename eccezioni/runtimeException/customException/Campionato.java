package eccezioni.runtimeException.customException;

class Campionato {

	private int numeroGiornate;
	
	public void setNumeroGiornate(int numeroGiornate) throws NumeroGiornateErrate {
		if(numeroGiornate == 0) {
			throw new NumeroGiornateErrate("from campionato", numeroGiornate);
		} 
		else {
			this.numeroGiornate = numeroGiornate;
		}
	} 
		
	public void numeroGiornate() {
		
	}


	public int getNumeroGiornate() {
		return numeroGiornate;
	}	
}
