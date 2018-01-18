package lezioni.fondamentidiinformatica.matrici;

class Main {

	public static void main(String[] args) {
		int a[][] = new int[][] {{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(Matrice.sommadiagonale(a));
		System.out.println(Matrice.fakeToString(a));
		System.out.println(Matrice.fakeToString(Matrice.trasposta(a)));
	}

}
