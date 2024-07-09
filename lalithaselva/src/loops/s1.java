package loops;

public class s1 {

	public static void main(String[] args) {
		/*
		 * switch(Expression)
		 * {
		 * 
		 * case:
		 *    sttement;
		 *    break;
		 * 
		 *  case:
		 *    sttement;
		 *    break;
		 *    
		 *   case:
		 *    sttement;
		 *    break;
		 *    
		 *    
		 *   default:
		 *      statement
		 *      break;
		 * 
		 * 
		 * */
		//double, float cannot be used 
		int age=60;
		switch(age)
		{
		
		case 0:
			 System.out.println("not born yet");
			 break;
			 
		case 4:
			System.out.println("toddler");
			break;
			
		case 18:
			 System.out.println("adult");
			 break;
			 
		case 60:
			System.out.println("old");
			break;
			
		default:
			System.out.println("doesnot match");
		    break;
	
		}
	}
}
