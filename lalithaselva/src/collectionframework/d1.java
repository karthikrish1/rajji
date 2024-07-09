package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class d1 {
	public static void main(String[] args) {
		
		/*container: ele will be strd along with its key
		 * key: any dtpe
		 * ele: any dtypa
		 * add
		 * remove
		 * retrve
		 * 
		 * tree map: kyes:  alpha/ascend
		 * linkedhs:         insertion
		 *hash                random
		 *
		 *TreeMap<dtypeofkey, dtypeofelement> name= new TreeMap<>();
		 *
		 *
		 **/
		TreeMap<Integer, String> n= new TreeMap<>();
		n.put(30, "apple");
		n.put(9, "zebra");
		n.put(2, "cat");
		n.put(7000, "banana");
		System.out.println(n);
		
		
		LinkedHashMap<Integer, String> n1= new LinkedHashMap<>();
		n1.put(30, "apple");
		n1.put(9, "zebra");
		n1.put(2, "cat");
		n1.put(7000, "banana");
		System.out.println(n1);
		
		HashMap<Integer, String> n11= new HashMap<>();
		n11.put(30, "apple");
		n11.put(9, "zebra");
		n11.put(2, "cat");
		n11.put(7000, "banana");
		System.out.println(n11);
		 
		 
	}
	

}
