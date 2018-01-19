package lezioni.classi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int casuale = (int)(Math.random()*6);
		
		System.out.println(casuale);
		Punto p1 = new Punto();
		Punto p2 = new Punto(1,2,3);
		Punto p3 = p2;
		p2.x = 10;
		System.out.println("Punto 1:" +  " x:" + p1.x + " y:" + p1.y + " z:" + p1.z);
		System.out.println("Punto 2:" +  " x:" + p2.x + " y:" + p2.y + " z:" + p2.z);
		System.out.println("Punto 3:" +  " x:" + p3.x + " y:" + p3.y + " z:" + p3.z);
		Persona studente = new Persona ();
		Persona professore = new Persona("Debora", "Bruno", 27);
		studente.nome="Antonio";
		studente.cognome="straface";
		studente.eta=35;
		studente=professore;
		studente.nome="Marco";
		System.out.println(professore.nome);
		Libro geronimo = new Libro();
		Libro iorobot = new Libro("Asimov","io Robot",245, 2005);
		geronimo.titolo = "le fantastiche avventure";
		Computer asus= new Computer("asus","ikea",1000,8);
		
	}
	
}
