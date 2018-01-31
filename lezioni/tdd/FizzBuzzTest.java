package lezioni.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	public void init(int num, String exp) {
		FizzBuzzGame prova = new FizzBuzzGame();
		prova.setNum(num);
		
		assert(prova.getString().equals(exp));
	}

	@Test
	public void verificaNumero() {
		init(4, "4");
	}
	
	
	@Test
	public void verificaBuzz() {
		init(3, "Buzz");
	}
	
	@Test
	public void verificaFizz() {
		init(5, "Fizz");
	}
	
	@Test
	public void verificaFizzBuzz() {
		init(15, "FizzBuzz");
	}
	
	

}
