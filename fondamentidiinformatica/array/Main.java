package fondamentidiinformatica.array;

class Main {

	public static void main(String[] args) {
		int a[] = {13,7,5,13};
		System.out.println(Array.ricercaLineare(a,7));
		
		int b[] = {1,5,7,13};
		System.out.println(Array.ricercaBinaria(b,7));
		
		int c[] = Array.sommaArray(b,7);		
		System.out.println(Array.fakeToString(c));
	}

}
