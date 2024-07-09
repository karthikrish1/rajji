package methids;

public class c1 {

	public static void main(String[] args) {
		
		/*constructr
		 *   take classname as its name
		 *   doesnot contain returntype
		 *   automatically called whenever an object is created 
		 *   
		 *   syntax for creation:public classname(){}
		 *   syntax for calling : classname objectname= new classname();* 
		 * */
		
		c1 ob= new c1();
		
		
	}
	
	public c1()
	{
		int s=3;
		System.out.println("Area of square is "+ s*s);
	}
}
