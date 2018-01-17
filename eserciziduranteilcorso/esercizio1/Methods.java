package eserciziduranteilcorso.esercizio1;


// Migliorabili con un operatore ternario

class Methods
{

	/*
	 * 1. Restituisce true se il primo è multiplo del secondo
	 */

	public static boolean primo(int m, int n)
	{

		return (m % n == 0) ? true : false;
	}

	/*
	 * 2. Restituisce la divisione dei due interi passati se il primo non è multiplo
	 * del secondo, altrimenti la moltiplicazione
	 */

	public static int secondo(int m, int n)
	{

		// Multiplo
		if (m % n == 0)
		{

			return m * n;

			// Non multiplo
		} else
		{

			return m / n;

		}
	}

	/*
	 * 3. Dati un intero ed un booleano restituisca true se l'intero è multiplo di 3
	 * e il boolean sia false
	 */

	public static boolean terzo(int i, boolean b)
	{

		if ((i % 3 == 0) && (!b))
			return true;

		return false;
	}

	/* 5 parametri in ingresso: 3 double e 2 boolean */

	public static double quarto(double d1, double d2, double d3, boolean b1, boolean b2)
	{

		return (b1 && b2) ? d1 + d2 + d3 : -1.0;
	}

	/* Restituisce il maggiore dei tre numeri */

	public static int quinto(int a, int b, int c)
	{

		return (a > b) ? ((a > c) ? a : (c > b) ? c : b) : (b > c) ? b : (c > a) ? c : a;
	}

	/* Maggiore tra 2 numeri */

	public static int maggioreTraDue(int n1, int n2)
	{
		return (n1 > n2) ? n1 : n2;
	}

	/* Maggiore tra 4 numeri */

	public static int maggioreTraQuattro(int n1, int n2, int n3, int n4)
	{
		int max1 = maggioreTraDue(n1, n2);
		int max2 = maggioreTraDue(n3, n4);

		return maggioreTraDue(max1, max2);
	}

	/* Minore tra 2 numeri */

	public static int minoreTraDue(int n1, int n2)
	{
		return (n1 < n2) ? n1 : n2;
	}

	/* Minore tra 4 numeri */

	public static int minoreTraQuattro(int n1, int n2, int n3, int n4)
	{
		if (minoreTraDue(n1, n2) < minoreTraDue(n3, n4))
		{
			return minoreTraDue(n1, n2);
		} else
		{
			return minoreTraDue(n3, n4);
		}
	}
	
	public static void figuraGeometrica(int numeroLati)
	{
		switch(numeroLati)
		{
			case 3: 	System.out.println("Triangolo");
						break;
			case 4: 	System.out.println("Quadrilatero");
						break;
			case 5: 	System.out.println("Pentagono");
						break;
			case 6: 	System.out.println("Esagono");
						break;
			default:	System.out.println("Nessuna");
						break;
		}
	}
}
