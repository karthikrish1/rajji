package exceptionhandling;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class e2 {

	public static void main(String[] args) {
		
		try {
			//System.out.println(3/0);
	String n="hi";
		System.out.println(n.charAt(5));
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("arth "+  e);
			}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("outof bound "+  e);
		}
		
		catch(Exception e)
		{
			System.out.println("error "+  e);
		}
		
		
	}
}
