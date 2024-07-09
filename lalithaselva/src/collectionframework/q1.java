package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {

	public static void main(String[] args) {
		// queue
		// not indexed
		//add
		// remove
		// retrive only head of the queue
		// itration
		// size limited
		
		//ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<>(size);
		
		ArrayBlockingQueue<Double> n= new ArrayBlockingQueue<>(4);
		n.add(3.4);
		n.add(20.4);
		n.add(3.2);
		n.add(10.3);
		System.out.println(n);
		
		n.remove(3.2);
		System.out.println(n);
		
		System.out.println(n.peek());
		
		for(double x: n)
		{
			System.out.println(x);
		}
	}

}
