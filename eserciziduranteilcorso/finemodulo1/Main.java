package eserciziduranteilcorso.finemodulo1;

public class Main {

	public static void main(String[] args)
	{
//		String caratteri = "AEIOUaeiou";
//		char [] arrayVocali = {'C','i','i','a','o','!'};
//		Vocale.vocale(arrayVocali, caratteri);
		
		String prova = "aoiueo";
		char [] caratteri = new char [] {
				'a', 'o', 'e', 'i', 'u'
		};
		
		int[][] matrice = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		int[] array = {1,2,3};
		int [] arrayRisultato = new int [array.length];
		arrayRisultato = Methods.moltiplicazioneMatriceArray(matrice, array);
		Methods.stampaArray(arrayRisultato);
		//System.out.println(Motodi.mostCaratteri(prova, caratteri));
	}
}
