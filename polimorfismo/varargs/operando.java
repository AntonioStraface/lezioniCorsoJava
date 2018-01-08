package polimorfismo.varargs;

class operando {
	
	public static int matematica(boolean operatore,int... a) {
		int c = 0;
		for(int tmp: a) {
			if(operatore) {
				c -= tmp; 
			}
			else {
				c += tmp; 
			}
		}		
		return c;
	}
	
}
