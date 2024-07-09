package extr;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicxpath {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver ce=new ChromeDriver();
    ce.get("http://www.mycontactform.com");
    
    // following
    //preceding
    
    //parent
    //child
    
    //following-sibling
    //preceding-sibling
    
    
    
   //usernametext=> login button
    
    //ce.findElementByXPath("//*[@id=\"user\"]//following::input[2]").click();
    
    // login button-> usrname
    
   // ce.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input//preceding::input[2]").sendKeys("hi");
    
   //parent=> child
   //String t = ce.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[3]").getText();
   //System.out.println(t);
    
    //child=> parent
   // Point c = ce.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[1]//parent::div").getLocation();
   // System.out.println(c);
    
    //following-sibling
    
    //String s = ce.findElementByXPath("//*[@id=\"right_col_bottom\"]/img//following-sibling::p[2]").getText();
    //System.out.println(s);
    
    
    //String s = ce.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]//preceding-sibling::p[2]").getText();
    //System.out.println(s);
    
    ce.quit();
	
}
}
