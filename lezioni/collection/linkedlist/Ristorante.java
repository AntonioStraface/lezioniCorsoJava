package lezioni.collection.linkedlist;

import java.util.LinkedList;

public class Ristorante {

	private LinkedList<Cliente> codaDiAttesa;
	
	public Ristorante() {
		setCodaDiAttesa(new LinkedList<Cliente>());
	}
	
	public void mettiInCoda(Cliente c) {
		codaDiAttesa.addLast(c);
	}
	
	public Cliente levaDallaCoda() {
		return codaDiAttesa.pollFirst();
	}

	public LinkedList<Cliente> getCodaDiAttesa() {
		return codaDiAttesa;
	}

	public void setCodaDiAttesa(LinkedList<Cliente> codaDiAttesa) {
		this.codaDiAttesa = codaDiAttesa;
	}
}
