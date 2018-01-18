package lezioni.ereditarietaEinterfacce.astratte;

public abstract class Strumento {
	private String nome, prezzo;
	
	public abstract void suonaFaDiesis();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
