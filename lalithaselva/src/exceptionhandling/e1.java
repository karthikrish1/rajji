package exceptionhandling;

public class e1 {

	/*exceptions 
	 * 
	 *checked
	 *unchecked  
	 * 
	 * mechanism that will help u to handle the exceptions
	 * 
	 * try catch
	 * try with multiple catch
	 * try catch finally
	 * throws
	 * throw
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		//try: code which is having prb of getting error
		//catch: executed when error occurs 
		
		try {
		System.out.println(3/0);
		}
		catch(Exception e)
		{
			System.out.println("error is "+ e);
		}
		finally
		{
			System.out.println("bye");
		}
	}
}
