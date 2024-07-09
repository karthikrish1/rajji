package collectionframework;

import java.util.ArrayList;

public class l1 {
	public static void main(String[] args) {
	ArrayList<String>l= new ArrayList<>();
		l.add("apple");
		l.add("cat");
		l.add("dog");
		l.add("elephant");
		System.out.println(l);
		//   index     0    1    2    3    
		//           apple cat  dog  elephant   
		
		// remove : knw the index
		l.remove(2);
		System.out.println(l);
		//retrival: know the index
		System.out.println(l.get(0));
		
		//iteration
		// for each :  for(datatype tempvariable:nameofthecollection)
		for(String x:l)
		{
			System.out.println(x);
		}
		// x=30
		//x=40
		//x=10
		
	}

}
