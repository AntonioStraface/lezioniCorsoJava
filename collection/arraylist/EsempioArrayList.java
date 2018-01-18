package collection.arraylist;

import java.util.ArrayList;

public class EsempioArrayList {

	public static void main(String [] args) {
		ArrayList <Integer> list = new ArrayList<>(1);
		long startTime = System.currentTimeMillis();
		int capacity = 10000000;
		list.ensureCapacity(capacity);
		for (int i=0; i< capacity; i ++) {
		   list.add(1);
		}
				
		long endTime = System.currentTimeMillis();
		System.out.println("tempo:" + (endTime - startTime));		
		
	}
}
