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
        	if (((number % 5) == 0) && ((number % 3) == 0)) // Is it a multiple of 5 & 7?
                return "FizzBuzz";
            if (number % 3 == 0) // When i is divisible by 3, then print "Fizz"
                return "Fizz";
            else if (number % 5 == 0) // When i is not divisible by 3 but is divisible by 5, then print "Buzz"
                return "Buzz";
            
            return "no Buzz";
    }
	
}
