package lezioni.fondamentidiinformatica.matrici;

class Matrice {
	
	
	public static int sommadiagonale(int matrice [][]) {
		int somma = 0;
		
		for(int i = 0; i < matrice.length; i++) {
			somma += matrice[i][i];
		} 
		
		return somma;
	}
	
	public static int [] [] trasposta(int matrice[][]) {
		
		for (int i=0; i<matrice.length; i++){
			for (int j= i+1; j<matrice[0].length; j++){
				int saveRow = matrice[i][j];
				matrice[i][j] = matrice[j][i];
				matrice[j][i] = saveRow;
			}
		}
		
		return matrice;
	} 
	
	
	
	public static String fakeToString(int matrice[][]) {
		String s = "";
		
		for (int i=0; i<matrice.length; i++){
			for (int j=0; j<matrice[0].length; j++){
				s += matrice[i][j] + " ";
			}			
			s += "\n";
		}
		
		return s.toString();
	}

}
