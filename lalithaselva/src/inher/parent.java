package inher;

public class parent {
	
	public static void ps()
	{
		System.out.println("parent class static method");
	}
	
	public void pn()
	{
		System.out.println("parent class nonstatic method");
	}

}


/*inheritance: process in which one class acquires properties of other class
 * 
 * parent/super/base:   class whose properties are inherited
 * child/sub/derived:  class which uses properties of parent class 
 * 
 * child is using parent class
 * 
 * to achieve:  child class definition=> extends parentclassname
 * 
 * single    : parent<=> child
 * multiple  :multiparents<=> child  java will not support it
 * hierrarchial: parent<=> multiple child
* 
 * */
