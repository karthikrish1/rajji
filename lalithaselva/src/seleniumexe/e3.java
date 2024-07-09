package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.seleniumeasy.com");
	
	//page down
	/*driver.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //down
	
	Thread.sleep(3000);
	driver.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	Thread.sleep(3000);
	
	*/
	
	
driver.executeScript("window.scrollBy(0,500)"); //down
	
	Thread.sleep(3000);
	driver.executeScript("window.scrollBy(0,-500)");
}
}
