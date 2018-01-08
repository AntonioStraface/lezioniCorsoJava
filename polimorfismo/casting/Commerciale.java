package polimorfismo.casting;

class Commerciale extends Dipendente {

	private String[] portafoglioClienti;
	
	public Commerciale() {
		portafoglioClienti = new String[11];
	}

	public String[] getPortafoglioClienti() {
		return portafoglioClienti;
	}

	public void setPortafoglioClienti(String[] portafoglioClienti) {
		this.portafoglioClienti = portafoglioClienti;
	}
}
