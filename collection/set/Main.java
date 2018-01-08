package collection.set;

public class Main {

	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		s.setTelefono("nokia");
		Smartphone s2 = new Smartphone();
		s2.setTelefono("nokia");		
		Negozio n = new Negozio();
		n.addSmartphone(s);
		n.addSmartphone(s2);
		
		System.out.println(n.getNumeroTelefoni());
	}

}