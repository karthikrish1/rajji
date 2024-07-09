package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	
	//title and url
	System.out.println(driver.executeScript("return document.title"));
	
	System.out.println(driver.executeScript("return document.URL"));
	
	driver.quit();
}
}
