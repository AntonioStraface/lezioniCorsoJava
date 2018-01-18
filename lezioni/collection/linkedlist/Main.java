package lezioni.collection.linkedlist;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Antonio");
		Cliente c2 = new Cliente();
		c2.setNome("Giovanni");		
		Ristorante r = new Ristorante();
		r.mettiInCoda(c1);
		r.mettiInCoda(c2);	
		System.out.println("pronto il tavolo per " + r.levaDallaCoda().getNome());
		r.levaDallaCoda();
		r.levaDallaCoda();
	}

}