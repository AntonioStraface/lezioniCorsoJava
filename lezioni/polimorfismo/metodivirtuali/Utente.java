package lezioni.polimorfismo.metodivirtuali;

class Utente {

	public void accende(Mac m) {
		m.accende();
	} 
	
	public void accende(Lenovo l) {
		l.accende();
	}
	
	public void accende(Asus s) {
		s.accende();
	}
}
