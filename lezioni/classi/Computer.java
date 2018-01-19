package lezioni.classi;

public class Computer {
	String marca, produttore;
	int costo, ram;

	public Computer(String nomemarca, String nomeproduttore, int costopc,
			int nram) {
		marca=nomemarca;
		produttore=nomeproduttore;
		costo=costopc;
		ram=nram;
	}
	public Computer(){
		marca="";
		produttore="";
		costo=0;
		ram=0;
		
		
	}

	
}
