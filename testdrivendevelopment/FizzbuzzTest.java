package testdrivendevelopment;

import org.junit.jupiter.api.Test;

class FizzbuzzTest {
	
	private void runFizzBuzz(int number, String expected) {
		Fizzbuzz fb = new Fizzbuzz();
		fb.setNumber(number);
		assert (fb.playTheGame().compareTo(expected) == 0);
	}

	@Test
	void testNoBuzz() {
		runFizzBuzz(1,"no Buzz");
	}
	
	@Test
	void testFizz() {
		runFizzBuzz(3,"Fizz");
	}
	
	@Test 
	void testBuzz() {
		runFizzBuzz(5,"Buzz");
	}
	
	@Test 
	void testFizzBuzz() {
		runFizzBuzz(15,"FizzBuzz");
	}

}
