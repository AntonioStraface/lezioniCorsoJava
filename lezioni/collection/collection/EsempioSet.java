package lezioni.collection.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class EsempioSet {

	 public static void main (String[] args) { 
		    TreeSet <String> smartphones = new TreeSet<String>();
			smartphones.add("Samsung Galaxy Note");
			smartphones.add("Iphone 7");
			smartphones.add("Asus Zen");
			smartphones.add("Asus Zen");
			Iterator<String> iterator = smartphones.iterator();
			
			while(iterator.hasNext()) {
				if(iterator.next().contains("Iphone")) {
					iterator.remove();
				}
			}
			
			System.out.println(smartphones.toString());
	 }	
}
