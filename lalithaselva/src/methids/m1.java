package methids;

public class m1 {
public static void main(String[] args) {
		
		m1.area();
		m1.addition();
	}
	
// call anywehre inside the project
	public static void area()
	{
		int l=4;
		int b=3;
		System.out.println("Area of rectangle is "+ l*b);
	}
	
	
	// cannot call outside the class 
	private static void addition()
	{
		double m=3.4;
		double n=2.3;
		System.out.println("Addition of two numbers "+ (m+n));
	}
	
}
/*method:   block of code which performs certain action
 * 
 * static, nonstatic 
 * 
 * static: fixed memory space
 * 
 * methods should be created outside the main metho
 * methods should be called inside the main method
 * 
 * syntax for creation: accessmodifier static returnypt name(){}
 * syntax fir calling: classname.methodname();
 * 
 * accessmodifier: public, private, protected
 * returntype: void , int, double, float, boolean, string, char
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 