package eserciziduranteilcorso.esercizio2;

public class Metodi
{
	public static void giornoSettimana(int giorno)
	{
		switch(giorno)
		{
			case 1: 	System.out.println("Lunedì");
						break;
			case 2: 	System.out.println("Martedì");
						break;
			case 3: 	System.out.println("Mercoledì");
						break;
			case 4: 	System.out.println("Giovedì");
						break;
			case 5: 	System.out.println("Venerdì");
						break;
			case 6: 	System.out.println("Sabato");
						break;
			case 7: 	System.out.println("Domenica");
						break;
		}
	}
	
	// Check di coerenza
	
	public static boolean controllaGiornoMese(int giorno, int mese)
	{
		boolean esiste = false;
		
		if(giorno == 30)
		{
			switch(mese)
			{
				case 4:					// aprile
				case 6:					// giugno
				case 9:					// settembre
				case 11: esiste = true;	// novembre
			}
		}
		else if(giorno == 28 && mese == 2) esiste = true;
		
		else if(giorno <= 31 && mese != 2
				&& mese != 4 && mese != 6
				&& mese != 9 && mese != 11) esiste = true;
		
		else if(giorno <= 29 && mese != 2) esiste = true;
		
		else if(giorno <= 28) esiste = true;
		
		return esiste;
	}
	
	// Procedura stampa mese
	
	public static void stampaGiornoMese(int giorno, int mese)
	{
		String m = "";
		
		if(controllaGiornoMese(giorno, mese))
		{
			switch(mese)
			{
				case 1:		m = " Gennaio";
							break;
				case 2:		m = " Febbraio";
							break;
				case 3:		m = " Marzo";
							break;
				case 4:		m = " Aprile";
							break;
				case 5:		m = " Maggio";
							break;
				case 6:		m = " Giugno";
							break;
				case 7:		m = " Luglio";
							break;
				case 8:		m = " Agosto";
							break;
				case 9:		m = " Settembre";
							break;
				case 10:	m = " Ottobre";
							break;
				case 11:	m = " Novembre";
							break;
				case 12:	m = " Dicembre";
							break;
			}
			
			System.out.println(giorno + m);
		}
	}
	
	/* Maggiore tra 2 numeri */

	public static int maggiore(int n1, int n2)
	{
		return (n1 > n2) ? n1 : n2;
	}
	
	/* Minore tra 2 numeri */

	public static int minore(int n1, int n2)
	{
		return (n1 < n2) ? n1 : n2;
	}
	
	/* Sottrazione tra A e B, se TEST vero
	 * verifica se valore > C, ELSE minore C.
	 * Stampa operazione e valore. */
	
	public static void testSottrazione(int a, int b, int c, boolean test)
	{
		int sottrazione = a - b;
		
		System.out.println(a + " - " + b + " = " + sottrazione);
		
		if(test && maggiore(sottrazione, c) == sottrazione)
			System.out.println("Operazione >= C");
		if(!test && minore(sottrazione, c) == sottrazione)
			System.out.println("Operazione < C");
	}
	
	// Addizione
	
	public static void testAddizione(int a, int b, int c, boolean test)
	{
		int addizione = a + b;
		
		System.out.println(a + " + " + b + " = " + addizione);
		
		if(test && maggiore(addizione, c) == addizione)
			System.out.println("Operazione >= C");
		if(!test && minore(addizione, c) == addizione)
			System.out.println("Operazione < C");
	}
	
	// Calcolatrice
	
	public static void testOperazione(int a, int b, int c, boolean test, char op)
	{
		int operazione = -1;
		
		switch(op)
		{
			case '+':	operazione = a+b;
						break;
			case '-':	operazione = a-b;
						break;
			case '*':	operazione = a*b;
						break;
			case '/':	operazione = a/b;
						break;
			case '%':	operazione = a%b;
						break;
		}
		
		System.out.println(a + " " + op + " " + b + " = " + operazione);
		
		if(test && maggiore(operazione, c) == operazione)
			System.out.println("Operazione >= C");
		if(!test && minore(operazione, c) == operazione)
			System.out.println("Operazione < C");
	}
}
