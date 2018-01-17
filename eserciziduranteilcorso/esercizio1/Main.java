package eserciziduranteilcorso.esercizio1;


class Main
{

	public static void main(String[] args)
	{

		// 1
		System.out.println("1:\t" + Methods.primo(125, 5) + "\n");

		// 2
		System.out.println("2:\t" + Methods.secondo(125, 5) + "\n");

		// 3
		System.out.println("3:\t" + Methods.terzo(27, false) + "\n");

		// 4
		System.out.println("4:\t" + Methods.quarto(5.3, 3.3, 2.2, true, true) + "\n");

		// 5
		System.out.println("5:\t" + Methods.quinto(3, 5, 4) + "\n");

		// 6
		System.out.println("6:\t" + Methods.maggioreTraDue(3, 5) + "\n");

		// 7
		System.out.println("7:\t" + Methods.maggioreTraQuattro(3, 5, 4, 2) + "\n");
		
		// 8
		System.out.println("8:\t" + Methods.minoreTraDue(3, 5) + "\n");

		// 9
		System.out.println("9:\t" + Methods.minoreTraQuattro(3, 5, 4, 2) + "\n");
		
		// 10
		System.out.println("10:\t");
		Methods.figuraGeometrica(6);
		System.out.println("\n");
	}

}
