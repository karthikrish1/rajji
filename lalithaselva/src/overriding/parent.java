package overriding;

public class parent {
	/*overriding: using same methodname for different purpose
	 *            showing difference in location
	 *            
	 *            method: parent: overriden method :   parent object
	 *            method: child : overriding method:   child object
	 *            
	 *            follows inheritance
	 *            nonstatic
	 * */
	
	//overriden method
	public void area()
	{
		int s=3;
		System.out.println("Area of square is "+ s*s);
	}

}
