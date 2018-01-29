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
		
		System.out.println(Motodi.mostCaratteri(prova, caratteri));
	}
}
