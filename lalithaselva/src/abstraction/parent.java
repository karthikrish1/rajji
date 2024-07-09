package abstraction;

abstract public class parent {
/*
 * abstraction: hiding implementation details
 * follows inheritance
 * 
 * can be achieved through abstract class and abstract method
 * class=> abstract class: add abstract keyword before it
 * 
 * abstract class: can have nrml method , abstract method
 * abstract method
 *      nonstatic
 *      will have abstract keyword
 *      will be empy in its own class
 *      will be redefined in its child class
 *      
 * cannot create an object for parent abstract class 
 * 
* */
	
	public void nm()
	{
		System.out.println("nrml method");
	}
	
	abstract public void ab();	
}
