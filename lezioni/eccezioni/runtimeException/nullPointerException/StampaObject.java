package lezioni.eccezioni.runtimeException.nullPointerException;

public class StampaObject {

	public static void main (String[] args) {
		Object a = null;
		try {
			a.toString();
		}		
		catch (NullPointerException e) {
			System.out.println("il tuo caro oggetto è nullo");
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		finally {
			System.out.println("saluto tutti");
		}
		
	}
}
