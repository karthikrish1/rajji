package interfacee;

public interface Intro {
	/*
	 * blue print of class
	 * doesnot contain main method
	 * doesnot contain static method
	 * contain nonstatic method with default keyword
	 * contain abstract method
	 *      abstract method
	 *          nonstatic
	 *          no abstract keyword
	 *          will be empty
	 *          will be redefined in the class 
	 * class<-> interface:    class definition=> implements interfacename 
	 ** 
	 * */
	
	default public void nm()
	{
		System.out.println("nonstatic method");
	}
	
	public void ab();

}
