package methids;

public class m2 {

	// should be created outside the main method
	// should be called inside the main method
	// returntype other than void-  int, double, float, boolean, string
	//          creation: add return statement at end
	//          calling : call it within sysout statmenet
	
	public static void main(String[] args) {
		
		System.out.println("Division of two numbers "+ m2.div());
		System.out.println("Area of rectangle "+ m2.area());
	}
	
	public static int div()
	{
		int a=40;
		int b=2;
		return a/b;
	}
	
	private static double area()
	{
		double l=3.2;
		double m=0.2;
		double Area=l*m;
		return Area;
	}
}
