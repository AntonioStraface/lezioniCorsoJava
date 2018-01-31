package eserciziduranteilcorso.finemodulo1;

import java.util.Arrays;

public class Methods {
	
	
	
	public static int [] moltiplicazioneMatriceArray(int[][] matrice, int[] array) {
		int[] risultato = new int[array.length];
		
		if( checkLength(matrice,array) ) {
			for(int i = 0; i < risultato.length; i++) {
				for(int j = 0; j < matrice [i].length; j++) {
					risultato[i] += matrice[i][j] * array[i];
				}\
			}
		}
		return risultato;
	}
	
	public static boolean checkLength (int[][] matrice, int[] array) {
			return (matrice[0].length == array.length) ;
	}
	
	public static void stampaArray (int [] array) {
		System.out.println("STAMPA ARRAY");
		for ( int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	
	public static int numVolte (String str, char c) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) result++;
		}
		return result;
	}

	public static char mostCaratteri(String str, char[] cs) {
		
		int [] vals = new int [cs.length];
		
		for (int i = 0; i < vals.length; i++) {
			vals[i] = numVolte(str, cs[i]);
		}
		
		int max = vals[0];
		int pos = 0;
		
		for (int i = 1; i < vals.length; i++) {
			if (max<vals[i]) {
				max = vals[i];
				pos = i;
			}
		}
		
		return cs[pos];
	}
	
	
	

	
	
	
	
}
