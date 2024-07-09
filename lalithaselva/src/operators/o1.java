package operators;

public class o1 {

	public static void main(String[] args) {
		// Arithmetic operators: +-,*,/
		//comparision operators: <,>,<=,>=,==,!=
		//ternary operator/conditional operator:   condition ? true: false
		//assignment operator: +=,-=,*=,/
		//logical operator:  and, or, not
		int age=4;
		//                 cond  ?   true  : false 
		System.out.println(age>18? "major" : "minor");
		
		int a=30;
		System.out.println(a);
		//a+=5;
		//a-=2;
		//a*=3;
		a/=2;
		System.out.println(a);
		/*
		 * and  &&
		 * 
		 * cond1    cond2    output
		 * true     true     true
		 * true     false    false
		 * false     true    false
		 * false     false   false 
		 * 
		 * 
		 *  or   ||
		 * 
		 * cond1    cond2    output
		 * true     true     true
		 * true     false    true
		 * false     true    true
		 * false     false   false 
		 * 
		 * 
		 * not   !
		 * 
		 * true   false
		 * false   true
		 * 
		 * * 
		 * */
		int m=3;
		int n=10;
		System.out.println("and");
		System.out.println(m<5 && n>5);
		System.out.println(m<5 && n==5);
		System.out.println(m==5 && n>5);
		System.out.println(m==5 && n==5);
		System.out.println();
		System.out.println("or");
		System.out.println(m<5 || n>5);
		System.out.println(m<5 || n==5);
		System.out.println(m==5 || n>5);
		System.out.println(m==5 || n==5);
		System.out.println();
		System.out.println("Not");
		System.out.println(m==3);
		System.out.println(m!=3);

	}

}
