package builtins;

public class s1 {

	public static void main(String[] args) {
		
		//String : class/datatype
		// n: variable and oject
		
		String n="Welcome";
		//index  0   1   2    3    4    5    6
		//       W   e   l    c    o    m     e
		
		System.out.println(n.length());
		System.out.println(n.indexOf('m'));
		System.out.println(n.charAt(0));
		
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		System.out.println(n.replace('l', 'k'));
		System.out.println(n.replace("We", "Me"));
		
		System.out.println(n.substring(0, 3));//0,1,2
		
		System.out.println(n.contains("come"));
		
		System.out.println(n);
	}
}
