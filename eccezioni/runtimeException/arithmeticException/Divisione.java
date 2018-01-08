package eccezioni.runtimeException.arithmeticException;


public class Divisione {

	public static void main (String[] args) {
		int a = 0;
		int b = 5;
	
		try {
			int c = b / a;
		}		
		catch (ArithmeticException e) {
			System.out.println("la divisione per zero non da un numero finito");
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		finally {
			System.out.println("ho finito");
		}
		
	}
	
	
}
