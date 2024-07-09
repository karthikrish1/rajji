package seleniumnavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");//1
		Thread.sleep(3000);
		driver.findElementByLinkText("Images").click();//2
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
	}
}
