package lezioni.trovailmaggiore;

public class TrovaIlMaggioreTraNnum {
	int [] array ;
	
	public TrovaIlMaggioreTraNnum ( int [] array ) {
		this.array = array;
		
	}
	
	public int search () {
		int temp= array[0];
		for(int i = 1; i < array.length ; i++) {
			if (temp <= array[i]) 
				temp = array[i];
		}
		return temp;
		
	}

}
