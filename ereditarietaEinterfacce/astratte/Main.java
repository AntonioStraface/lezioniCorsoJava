package ereditarietaEinterfacce.astratte;

public class Main {

	public static void main (String[] args) {
		Chitarra chitarra = new Chitarra();
		chitarra.setNome("bambola");
		chitarra.suonaFaDiesis();
		Chitarra chitarrabis = new Chitarra();
		chitarrabis.setNome("dfd");
		System.out.println(chitarra.toString());
	}
}
