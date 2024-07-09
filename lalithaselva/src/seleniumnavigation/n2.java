package seleniumnavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class n2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    driver.manage().window().maximize();
	    
	   //open seleniumeasy.com in new tab   
	 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
	 
	 

	 //get the control of first tab: driver.getwindowhandle()=> String => parent
	 //get the control of both tabs: driver.getwindowhandles() s1={google, seleniumeasy.com}
	 
	 
	
	  String parent=driver.getWindowHandle();// control will be in the parent window //google
	 // collecting all the handle
	  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
	  
	
	  
	  //step3: iteration
	 
	  
	// iterate through the elements present in set
	 
	  Iterator<String> I1 = s1.iterator();  // hasNext , next()

	  // hasnext=> whether content is there
	  // next -> read the content 
	  while(I1.hasNext())// whether any content is there 
	    {
	      String child_window=I1.next();
	      if(!parent.equals(child_window))// picking the seleniumeasy.com
	    	  { // control is moved to child window 
	        driver.switchTo().window(child_window);
	        System.out.println(driver.getTitle());
	        Thread.sleep(4000);
	        driver.findElementByLinkText("Maven").click();
	        Thread.sleep(4000);
	        driver.close();
	      } 
	      
	      /*parent: google
	       *s1={google, seleniumeasy.com}
	       *
	       *first iteration: I1 point to google .com(first element in set)
	       *   I1.hasnext=> content
	       *        I1.next  reads google.com and store in child_window
	       *        child_window=google.com
	       *         if parent!=child_window
	       *         google!=google
	       *         
	       * second iteration: I1 points to second element in set
	       *   I1.hasnext=> content
	       *       I1.next reads seleniumeasy.com and store in child_window
	       *       child_Window=seleniumeasy.com
	       *       parent!=child_window
	       *       google!seleniumeasy.com
	       *       
	       *                switching control to child_window
	       *                moving cursor to seleniumeasy.com
	       *                getting title
	       *                4 seconds
	       *                MAven
	       *                4 seconds
	       *                close => seleniumeasy.com alone will be closed 
	       *                
	       *  Third iteration: stop            
	       *    
	 * */
	      
	 
	    
	  }

	    driver.switchTo().window(parent);//google 
	    System.out.println(driver.getTitle());// google
	    //driver.findElement(By.linkText("Images")).click();
	    Thread.sleep(5000);
	    driver.findElementByLinkText("Images").click();
	    Thread.sleep(5000);
	    driver.quit();
	}
	}


