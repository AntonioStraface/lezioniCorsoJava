package lezioni.tdd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FizzBuzzGame game = new FizzBuzzGame ();
		
		for(int i = 1; i <= 100; i++) {
		game.setNum(i);
		System.out.print(game.getString() +" ");
			
		}

	}

}
