package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m1 {
	public static void main(String[] args) throws InterruptedException {
		
		/*click
		 *double click
		 *right click/context click
		 *clicm hold and release
		 *mouse hovering
		 *drag and drop
		 *drag and drop by
		 *
		 *create an object for actions class
		 *pass driver instane as input
		 * * 
		 * */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.mycontactform.com");
		
		WebElement ele = driver.findElementByClassName("btn_log");
		Actions ac=new Actions(driver);
		//ac.click(ele).build().perform();
		//ac.doubleClick(ele).build().perform();
		//ac.contextClick(ele).build().perform();
		//ac.moveToElement(ele).click().build().perform();
		ac.clickAndHold(ele).build().perform();
		Thread.sleep(3000);
		ac.release(ele).build().perform();
	}

}
