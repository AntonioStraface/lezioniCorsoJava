package eccezioni.runtimeException.customException;

@SuppressWarnings("serial")
class NumeroGiornateErrate extends Exception {
	private int numeroGiornateErrato;
	
	public NumeroGiornateErrate(String msg,int numeroGiornateErrato) {
		super(msg);
		this.numeroGiornateErrato = numeroGiornateErrato;
	}
	
	@Override
	public String getMessage() {
		return "NumeroGiornateNonConsentito: "+ numeroGiornateErrato + " "+ super.getMessage();
	}
	
}
