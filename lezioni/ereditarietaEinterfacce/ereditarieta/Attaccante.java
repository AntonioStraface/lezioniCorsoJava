package lezioni.ereditarietaEinterfacce.ereditarieta;

public class Attaccante extends Calciatore{
	public final String ruolo = "Attaccante";

	public Attaccante() {
		System.out.println("sono un attaccante");
	}
	
	public Attaccante(String nome,String cognome,String ruolo) {
		super(nome,cognome,ruolo);
	}
}
