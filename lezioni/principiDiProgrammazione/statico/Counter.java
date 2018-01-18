package lezioni.principiDiProgrammazione.statico;

class Counter {

	private static int counter = 0;
	
	public Counter() {
		counter++;
	}

	public int getNumber() {
		return counter;
	}
}
