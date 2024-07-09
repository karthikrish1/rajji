package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slid {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		//horizontal : x
		// y value will be 0
		driver.switchTo().frame(0);
		Actions ac= new Actions(driver);
		WebElement ele = driver.findElementById("slider");
		ac.dragAndDropBy(ele, 60, 0).build().perform();
	}

}
