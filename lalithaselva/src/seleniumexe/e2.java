package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	
	//zoom in: more than 100
	// zoom out: less than 100
	// nrml: 100
	
	driver.executeScript("document.body.style.zoom='200%'");
	Thread.sleep(3000);
	
	driver.executeScript("document.body.style.zoom='100%'");
	Thread.sleep(3000);
	
	driver.executeScript("document.body.style.zoom='20%'");
}

}
