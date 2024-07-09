package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class radio {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	
	driver.findElementById("bmwradio").click();
	Thread.sleep(3000);
	
	driver.findElementById("benzradio").click();
	Thread.sleep(3000);
	
	driver.findElementById("hondaradio").click();
	Thread.sleep(3000);
	driver.quit();
}
}
