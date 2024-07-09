package collectionframework;

import java.util.Hashtable;
import java.util.TreeMap;

public class l2 {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> n= new Hashtable<>();
		n.put(30, "apple");
		n.put(9, "zebra");
		n.put(2, "cat");
		n.put(7000, "banana");
		System.out.println(n);
		
		//remove: know the key
		n.remove(9);
		System.out.println(n);
		
		System.out.println(n.get(2));
		
		System.out.println(n.keySet());
		
		System.out.println(n.values());
		
		//Hashtable
		// key: Double
		// element: Integer
		
	}

}
