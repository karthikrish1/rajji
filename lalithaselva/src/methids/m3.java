package methids;

public class m3 {

	//parameter: name given to a memory location
	// argument: value assigned to the parameter while calling 
	
	public static void main(String[] args) {
		
		m3.details("dhivya", 30);
		System.out.println("Addition is "+ m3.addition(20, 40));
		m4 ob= new m4();
		ob.div();
		//ob.perimter();
	}
	
	public static void details(String name, int age )// name, age=> parameters 
	{
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
	}
	
	
	public static int addition(int a, int b)
	{
		return a*b;
	}
}

