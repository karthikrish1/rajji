package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	
	//cookies : temporary information sted by the browser
	// set
	
	 Set<Cookie> s = driver.manage().getCookies();
	System.out.println("Number of cookies "+ s.size());
	
	driver.quit();
}
}
