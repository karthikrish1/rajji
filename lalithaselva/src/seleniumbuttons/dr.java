package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dr {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");

//create a object for selct class
	// pass dropdown box as inpt
	// index/value/visible text
	// at a time only one option can be selected
	
	WebElement ele = driver.findElementById("carselect");
	Select s= new Select(ele);
	//s.selectByIndex(1);
	s.selectByValue("benz");
	s.selectByVisibleText("Benz");
}
}
