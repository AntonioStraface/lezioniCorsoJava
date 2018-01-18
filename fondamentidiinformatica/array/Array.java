package fondamentidiinformatica.array;

public class Array {
	
	public static void somma(int[] numeri){
		int somma = 0;
		for(int i = 0; i<numeri.length; i++){
			//somma = somma + numeri[i];
			somma += numeri[i];
		}
		System.out.println(somma);
	}
	
	public static int ricercaLineare(int []sequenzaDisordinata, int numeroDaTrovare) {
		
		for(int i= 0; i< sequenzaDisordinata.length; i++) {
			if(sequenzaDisordinata[i] == numeroDaTrovare) {
				return i;
			}
		}
		
		return -1;
	}
	

	public static int ricercaBinaria(int []sequenzaOrdinata, int numeroDaTrovare) {
		int inizio = 0;
		int fine = sequenzaOrdinata.length-1;
		
		while (inizio<=fine) {
			int mid = (inizio+fine)/2;
			if(sequenzaOrdinata[mid]==numeroDaTrovare) {
				return mid; 
		    }
			else if (sequenzaOrdinata[mid]<numeroDaTrovare) {
				inizio = mid + 1;
			}
			else {
				fine = mid - 1;
			}
		}
		return -1;		
	}
	
	public static int[] sommaArray(int []a, int b) {
		int somma[] = new int[a.length];
		
		for(int i=0; i<somma.length; i++) {
			somma[i] = a[i] + b;
		}
		
		return somma;
	}
	
	public static String fakeToString(int a[]) {
		String s = "";
		
		for(int i: a) {
			s += i + " ";
		}
		
		return s.toString();
	}
}
