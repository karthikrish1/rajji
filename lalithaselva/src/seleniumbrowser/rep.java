package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class rep {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//position: Point
	// create an object for Point class
	// pass desired x and y in it
	// apply it on the window
	
	Point d= new Point(300,400);
	driver.manage().window().setPosition(d);
	
	Thread.sleep(3000);
	driver.quit();
}
}
