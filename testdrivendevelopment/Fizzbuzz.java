package testdrivendevelopment;

public class Fizzbuzz {
	
	private int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String playTheGame() {		
        	if (((number % 5) == 0) 
        			&& ((number % 3) == 0)) 
                return "FizzBuzz";
        	else if (number % 3 == 0) 
                return "Fizz";
            else if (number % 5 == 0) 
                return "Buzz";
            return Integer.toString(number);
    }
	
}
