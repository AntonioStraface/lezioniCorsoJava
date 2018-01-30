package lezioni.tdd;

public class FizzBuzzGame {
	
	private int numero;
	
	public FizzBuzzGame() {
		numero = -1;
	}
	
	public void setNum (int numero) {
		this.numero = numero;
	}
	
	public String getString() {
		
		if ( (numero%5)==0
				&&(numero%3)==0) {
			return "FizzBuzz";
		}
		
		else if(numero%5 == 0)
		{
			return "Fizz";
		}
		
		else if((this.numero % 3) == 0)
		{
			return "Buzz";
		} 
		return Integer.toString(numero);
	}
		
}
