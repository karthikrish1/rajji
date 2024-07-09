package seleniumget;

import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	
	//title
	System.out.println(driver.getTitle());
	
	//url
	System.out.println(driver.getCurrentUrl());
	
	//size: height and width of the window: dimension
	System.out.println(driver.manage().window().getSize());
	
	//position : x and y value of the window: point 
	System.out.println(driver.manage().window().getPosition());
	
	//browser details
	System.out.println(driver.getCapabilities());
	
	driver.quit();
}
}
