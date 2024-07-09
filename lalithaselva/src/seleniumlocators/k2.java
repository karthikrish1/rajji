package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class k2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	
	//linktext: word/words=> click -> new url will be opened
	// partial linktext: substring of linktext
	
	//driver.findElementByLinkText("Images").click();
	
	driver.findElementByPartialLinkText("Im").click();
}
}
