package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lstb {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");

//create a object for selct class
	// pass dropdown box as inpt
	// index/value/visible text
	// at a time multiple can be selected
	
	WebElement ele = driver.findElementById("multiple-select-example");
	Select s= new Select(ele);
	s.selectByIndex(0);
	s.selectByValue("orange");
	s.selectByVisibleText("Peach");
	Thread.sleep(3000);
	s.deselectByIndex(1);
}
}
