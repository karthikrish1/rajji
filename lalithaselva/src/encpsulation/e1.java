package encpsulation;

public class e1 {
	
	
	private String password;
	
	//setter: assign value to the variable
	
	public void set(String p)
	{
		password=p;
	}
	
	//getter: view the value stored in the variable
	
	public void get()
	{
		System.out.println(password);
	}

}


/*encapsulation:  data hiding
 * doesnot follow inheirtance
 * 
 * declare the variable as private
 * must not assign value straightly to the variable
 * access the variable through setter and getter
 * setter: assign value to the variable
 * getter:  view the value stored in the variable* 
 * 
 * 
 * */
