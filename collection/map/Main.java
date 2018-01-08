package collection.map;

public class Main {

	public static void main(String[] args) {
		
		Collezionista c = new Collezionista();
		
		Film f1 = new Film("la mosca");
		Film f2 = new Film("il pasto nudo");
		Regista r1 = new Regista("Cronenberg");
		r1.addFilms(f2,f1);
		
		c.aggiungiAcatalogo(r1);
		
		Film ff = new Film("crash");
		r1.addFilm(ff);		
		c.aggiungiAcatalogo(r1);
		
		Film f3 = new Film("mulholland drive");
		Film f4 = new Film("inland empire");
		Regista r2 = new Regista("Lynch");
		r2.addFilms(f3,f4);
		
		c.aggiungiAcatalogo(r2);
		
		System.out.println(c.toString());		
		System.out.println(c.prendiDaCatalogo(r1).ultimoFilm().getTitolo());
	}

}
