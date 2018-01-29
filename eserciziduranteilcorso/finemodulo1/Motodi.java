package eserciziduranteilcorso.finemodulo1;

public class Motodi {
	
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
