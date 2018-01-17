
public class Methods {

	public static boolean primo(int a, int b) {
		boolean result = false;
		result = (a % b == 0) ? true : false;
		/*
		 * if(a%b == 0) { result = true; }
		 */
		return result;
	}

	public static int secondo(int a, int b) {
		int result = 0;
		result = (a % b != 0) ? (a / b) : (a * b);
		/*
		 * if(a%b != 0) { result = a/b; } else { result = a*b; }
		 */
		return result;

	}

	public static boolean terzo(int a, boolean b) {
		boolean result = false;
		result = (a % 3 == 0 && !b) ? true : false;
		/*
		 * if(a%3 == 0 && b == false) { result = true; }
		 */
		return result;

	}

	public static int quarto(int a, int b, int c, boolean d, boolean e) {
		return (d && e) ? a + b + c : -1;
		/*
		 * int result = -1; if(d && e) { result = a+b+c; } return result;
		 */
	}

	public static int numeroAlto(int a, int b, int c) {
		int result = 0;
		if (a > b) {
			result = a;
		} else
			result = b;
		if (result < c) {
			result = c;
		}
		return result;

	}

	public static int numeroAlto(int a, int b, int c, int d) {
		/*
		 * int max1 = 0; int max2 = 0;
		 * 
		 * if(a > b) max1 = a; else max1 = b; if(c > d) max2 = c; else max2 = d; if(max1
		 * > max2) max = max1; else max = max2; return max;
		 * 
		 * 
		 * max1 = confronto(a,b); max2 = confronto(c,d);
		 */
		return confrontoI(confrontoI(a, b), confrontoI(c, d));

	}

	public static int confrontoI(int a, int b) {
		/*
		 * if(a > b) return a; else return b;
		 */
		return (a > b) ? a : b;
	}
	
	public static boolean confrontoB(int a, int b) {
		/*
		 * if(a > b) return a; else return b;
		 */
		return (a >= b);
	}

	public static void nomeFigura(int lati) {
		switch (lati) {
		case 3:
			System.out.println("Triangolo");
			break;
		case 4:
			System.out.println("Quadrato");
			break;
		case 5:
			System.out.println("Pentagono");
			break;
		default:
			System.out.println("Il numero da te inserito non corrisponde a nessuna figura");
			break;
		}
	}

	public static void giornoSett(int giorno) {
		switch (giorno) {
			case 1:
				System.out.println("Lunedì");
				break;
			case 2:
				System.out.println("Martedì");
				break;
			case 3:
				System.out.println("Mercoledì");
				break;
			case 4:
				System.out.println("Giovedì");
				break;
			case 5:
				System.out.println("Venerdì");
				break;
			case 6:
				System.out.println("Sabato");
				break;
			case 7:
				System.out.println("Domenica");
				break;
			default:
				System.out.println("Il giorno è inesistente");
				break;
		}
	}
	
	public static void data(int giorno, int mese) {
		if(!checkGiorno(giorno,mese)) {
			mese(mese);
			giorno(giorno);
		}
		else System.out.println("Il giorno non esiste nel mese");
		
	}
	
	public static boolean checkGiorno(int giorno, int mese) {
		if(giorno > 31 && (mese == 4 || mese == 6 || mese == 9 || mese == 11)) return true;
		else if(giorno > 30 && (mese == 1 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12)) return true;
		else if(giorno > 28 && mese == 2) return true;
		else return false;
	} 
	
	public static void giorno(int giorno) {
		System.out.print(giorno);
	}
	
	public static void mese(int mese) {
		switch(mese) {
			case 1: System.out.print("Gennaio ");
				break;
			case 2: System.out.print("Febbraio ");
				break;
			case 3: System.out.print("Marzo ");
				break;
			case 4: System.out.print("Aprile ");
				break;
			case 5: System.out.print("Maggio ");
				break;
			case 6: System.out.print("Giugno ");
				break;
			case 7: System.out.print("Luglio ");
				break;
			case 8: System.out.print("Agosto ");
				break;
			case 9: System.out.print("Settembre ");
				break;
			case 10: System.out.print("Ottobre ");
				break;
			case 11: System.out.print("Novembre ");
				break;
			case 12: System.out.print("Dicembre ");
				break;
			default: System.out.print("Il mese non esiste");
				break;
		}
	}
	
	public static void testSottrazione(int a, int b, int c, boolean test) {
		int res = 0;
		boolean conf;
		res = a-b;
		if(test) conf = confrontoB(res,c);
		else conf = confrontoB(c,res);
		if(conf) System.out.println("Risultato: "+a+" - "+b+" = "+res+"  Il valore è maggiore di: "+c);
		else System.out.println("Risultato: "+a+" - "+b+" = "+res+"  Il valore è minore di: "+c);
	
	}
	
	public static void testAddizione(int a, int b, int c, boolean test) {
		int res = 0;
		boolean conf;
		res = a+b;
		if(test) conf = confrontoB(res,c);
		else conf = confrontoB(c,res);
		if(conf) System.out.println("Risultato: "+a+" + "+b+" = "+res+"  Il valore è maggiore di: "+c);
		else System.out.println("Risultato: "+a+" + "+b+" = "+res+"  Il valore è minore di: "+c);
	
	}

	public static void operazione(int a, int b, int c, char o, boolean test) {
		int res = 0;
		switch(o) {
			case '+':
				res = somma(a,b);
				if(check(test,res,c)) System.out.println("Risultato: "+a+" + "+b+" = "+res+"  Il valore è maggiore o uguale di: "+c);
				else System.out.println("Risultato: "+a+" + "+b+" = "+res+"  Il valore è minore di: "+c);
				break;
			case '-':
				res = sottrazione(a,b);
				if(check(test,res,c)) System.out.println("Risultato: "+a+" - "+b+" = "+res+"  Il valore è maggiore di: "+c);
				else System.out.println("Risultato: "+a+" - "+b+" = "+res+"  Il valore è minore di: "+c);
				break;
			case '*':
				res = moltiplicazione(a,b);
				if(check(test,res,c)) System.out.println("Risultato: "+a+" * "+b+" = "+res+"  Il valore è maggiore di: "+c);
				else System.out.println("Risultato: "+a+" * "+b+" = "+res+"  Il valore è minore di: "+c);
				break;
			case '/':
				res = divisione(a,b);
				if(check(test,res,c)) System.out.println("Risultato: "+a+" / "+b+" = "+res+"  Il valore è maggiore di: "+c);
				else System.out.println("Risultato: "+a+" / "+b+" = "+res+"  Il valore è minore di: "+c);
				break;
			default: System.out.println("ERRORE");
				break;
		}
	}
	
	public static int somma(int a, int b) {
		return a + b;
	};
	
	public static int sottrazione(int a, int b) {
		return a - b;
	}
	
	public static int moltiplicazione(int a, int b) {
		return a * b;
	}
	
	public static int divisione(int a, int b) {
		return a / b;
	}
	
	public static boolean check(boolean test, int res, int c) {
		boolean conf;
		if(test) conf = confrontoB(res,c);
		else conf = confrontoB(c,res);
		return conf;
	}
}

