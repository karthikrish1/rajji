package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class i1 {
public static void main(String[] args) throws InterruptedException {
	//configuring the edge driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	
	//maximise 
	driver.manage().window().maximize();
	
	//refresh
	driver.navigate().refresh();
	
	//hold the page for certain seconds
	Thread.sleep(3000);
	
	//close
	driver.quit();
}
}
