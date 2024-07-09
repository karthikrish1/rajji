package overloading;

public class c1 {//constructor
	// syntax for creation: accesmdofier classname{}
	// syntax for callig: classname objectname= new classname();

	public static void main(String[] args) {
		c1 ob= new c1();
		c1 ob1= new c1(9);
		c1 ob2= new c1(3.4);
		c1 ob3= new c1(2,3.4);
		c1 ob4= new c1(10.4,9);
		
	}
public c1()//0
	{
		System.out.println("hi");
	}
	public c1(int s)//1
	{
		System.out.println("area of square is "+ s*s);
	}
	public c1(double r)
	{
		System.out.println("area of circle is "+ 3.14*r*r);
	}
	public c1(int s, double b)
	{
		System.out.println("area of rectangle is "+ s*b);
	}
	public c1(double b, int s)
	{
		System.out.println("area of triangle is "+ 0.5*b*s);
	}
	
}
