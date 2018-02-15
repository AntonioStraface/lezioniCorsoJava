package eserciziduranteilcorso.Collection;

public class Alunno {
	private String nome;
	private int eta;
	
	public Alunno(String nome, int eta) {
		setEta(eta);
		setNome(nome);
	}
	
	public int getEta() {
		return eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override 
	public boolean equals(Object confronto) {
		if(confronto instanceof Alunno) {
			Alunno conf= (Alunno) confronto;
			return ( this.getEta() == conf.getEta() 
					&& this.getNome() == conf.getNome());
		}
		return false;	
	}
	
}
