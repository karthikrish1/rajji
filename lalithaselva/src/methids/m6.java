package methids;

public class m6 {
	public static void main(String[] args) {
		//parameter:  variable passed to a function definition
		// argument: value assigned to the parameter while calling it
		m6 ob= new m6();
		ob.display("dhivya", 40);
		System.out.println("Addition of two numbers "+ ob.addition(3.2f, 4.5f));
		
	}
	
	public void display(String name, int age)
	{
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
	}
	
	public float addition(float a, float b)
	{
		return a+b;
	}

}
