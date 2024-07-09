package exceptionhandling;

import java.util.Scanner;

public class e3 {

	// throw new exceptionname("message")
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter ur age : ");
		int age=s.nextInt();
		if(age>18)
		{
			System.out.println("major");
		}
		else
		{
			throw new ArithmeticException("cannot vote");
		}
	}
}
