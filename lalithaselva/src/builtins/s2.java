package builtins;

public class s2 {

	public static void main(String[] args) {
		
		//classname objectn=new classnmae();
		StringBuffer n=new StringBuffer("Welcome");
		//index  0   1   2    3    4    5    6
		//       W   e   l    c    o    m     e
		
		System.out.println(n.length());
		System.out.println(n.indexOf("m"));
		System.out.println(n.charAt(0));
		
		//append
		System.out.println(n.append("hi"));
		//insert
		System.out.println(n.insert(1, "OO"));
		
		//delete
		System.out.println(n.deleteCharAt(1));
		
		System.out.println(n.delete(0, 2));//0,1
		
		//reversing
		System.out.println(n.reverse());
		System.out.println(n.reverse());
		//replace
		System.out.println(n.replace(0, 2, "LL"));
	}
}
