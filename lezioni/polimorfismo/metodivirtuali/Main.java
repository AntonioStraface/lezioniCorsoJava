package lezioni.polimorfismo.metodivirtuali;



class Main {

	public static void main (String[] args) {
		UtenteSmart u = new UtenteSmart();
		Mac m = new Mac();
		u.accende(m);	
	}
}
