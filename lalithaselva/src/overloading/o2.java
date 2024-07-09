package overloading;
public class o2 {
public static void main(String[] args) {
		o2 ob= new o2();
		ob.area();
		ob.area(3);
		ob.area(3.4);
		ob.area(3, 40.9);
		ob.area(3.4, 10);
		}
	public  void area()//0
	{
		System.out.println("hi");
	}
	public  void area(int s)//1
	{
		System.out.println("area of square is "+ s*s);
	}
	public  void area(double r)
	{
		System.out.println("area of circle is "+ 3.14*r*r);
	}
	public  void area(int s, double b)
	{
		System.out.println("area of rectangle is "+ s*b);
	}
	public  void area(double b, int s)
	{
		System.out.println("area of triangle is "+ 0.5*b*s);
	}
	
}
