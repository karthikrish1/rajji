package inher;

public class child extends parent {

	public static void main(String[] args) {
		
		//calling its own method
		
		child.cs();
		child c= new child();
		c.cn();
		
		// call parent's method
		child.ps();// calling parent clas static method with child name
		c.pn();   //  callint parent class nonstatic method with child object
	}
	
	

	public static void cs()
	{
		System.out.println("child class static method");
	}
	
	public void cn()
	{
		System.out.println("child class nonstatic method");
	}
}
