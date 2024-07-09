package methids;

public class m5 {

	public static void main(String[] args) {
		
		// creation: add retn 
		// calling: with sys
		m5 ob= new m5();
		System.out.println("addition "+ ob.add());
		System.out.println("Product "+ ob.prod());
	}
	
	public float add()
	{
		float a=7.5f;
		float b=7.5f;
		return a+b;
	}
	
	private int prod()
	{
		int a=7;
		int b=9;
		return a*b;
	}
}
