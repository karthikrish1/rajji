package builtins;

import java.util.Scanner;

public class scr {
public static void main(String[] args) {
	//scanner: nonstatic
	Scanner s= new Scanner(System.in);
	//string-> nextLine()
	//integer-> nextInt
	//double=> nextDouble
	// float=> nextfloat
	
	System.out.println("Enter your name :");
	String name=s.nextLine();
	System.out.println("Enter your age : ");
	int age=s.nextInt();
	System.out.println("enter ur salary:");
	double sal=s.nextDouble();
	
	System.out.println("Name is "+ name);
	System.out.println("Age is "+ age);
	System.out.println("Salary is "+ sal);
	
}
}
