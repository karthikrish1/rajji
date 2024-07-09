package overloading;

public class o1 {
	/*inheritance
	 * polymorphism: overloading and overriding 
	 * encapsulation
	 * abstraction
	 * 
	 * overloading:  using same methodname for dofferent purpose
	 *               showing difference in number/datatype/sequence of parameters
	 *               static
	 *               nonstatic
	 *               constructor * 
	 * */

	public static void main(String[] args) {
		o1.area();
		o1.area(3);
		o1.area(3.2);
		o1.area(40, 9.4);
		o1.area(3.4, 10);
	}
	
	public static void area()//0
	{
		System.out.println("hi");
	}
	
	public static void area(int s)//1
	{
		System.out.println("area of square is "+ s*s);
	}
	
	public static void area(double r)
	{
		System.out.println("area of circle is "+ 3.14*r*r);
	}
	public static void area(int s, double b)
	{
		System.out.println("area of rectangle is "+ s*b);
	}
	
	public static void area(double b, int s)
	{
		System.out.println("area of triangle is "+ 0.5*b*s);
	}
	
	
}
