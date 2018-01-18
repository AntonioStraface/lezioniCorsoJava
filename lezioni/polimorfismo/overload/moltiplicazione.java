package lezioni.polimorfismo.overload;

class moltiplicazione {

	public float moltiplica(float a, float b) {
		return a * b;
	}
	
	public float moltiplica(int a, float b) {
		return a * b;
	}
	
	public float moltiplica(float b, int a) {
		return a * b;
	}
	
	public int moltiplica(int a, int b) {
		return a * b;
	}
	
	public int moltiplica(int a, int b, int c) {
		return a * b * c;
	}
	
}
