package eserciziduranteilcorso.finemodulo1;

public class verificaSimmetria {
	public static boolean matricesim(int[][] matrice) {
	
		
		for(int i = 0; i < matrice.length; i++) {
			
			for(int j = 0; j < matrice[i].length; j++) {
				if(matrice[i][j] != matrice[j][i] ) {
				return false;
					
				
					
				}
			}
		}
		return true;
		
	}

}
