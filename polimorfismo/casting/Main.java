package polimorfismo.casting;

public class Main {
	
	public static void main (String[] args) {
		Programmatore p = new Programmatore();
		Commerciale c = new Commerciale();
		Object d[] = new Object[2];
		d[0] = p;
		d[1] = c;
		System.out.println(Dipendente.stipendioVincente(d));
	}

}