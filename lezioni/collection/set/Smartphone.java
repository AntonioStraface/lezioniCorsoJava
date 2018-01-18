package lezioni.collection.set;

class Smartphone implements Comparable<Smartphone> {

	private Double prezzo;
	private String telefono;

	@Override
	public int compareTo(Smartphone s) {
		if (this.telefono != s.telefono) {
			return 1;
		}
		return 0;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
