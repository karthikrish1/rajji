package spr;

public class child  extends parent{

	int age=100;
	public static void main(String[] args) {
		
		child c= new child();
		c.ab();
	}
	
	public void ab()
	{
		System.out.println(age);//locally defined age
		System.out.println(super.age);//parent age value
	}
}
