package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {
public static void main(String[] args) {
	
	// locators: find the web element
	/*
	 * id
	 * name
	 * classname: npt preferrable
	 * 
	 * linktext
	 * partial link text
	 * 
	 * tagname
	 * xpath 
	 * css	 * 
 * */
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.mycontactform.com");
	// id=user 
	driver.findElementById("user").sendKeys("Dhivyakarthi123");
	
	//name=pass
	
	driver.findElementByName("pass").sendKeys("12345");
	
	driver.findElementByClassName("btn_log").click();
	
}
}
