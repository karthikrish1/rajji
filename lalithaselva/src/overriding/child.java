package overriding;

public class child  extends parent{
	
	public static void main(String[] args) {
		
		//overriden method
		
		parent p= new parent();
		p.area();
		
		child c= new child();
		c.area();
	}

	//overriding method
	public void area()
	{
		int l=4;
		int b=3;
		System.out.println("Area of rectangle is "+ l*b);
	}
}
