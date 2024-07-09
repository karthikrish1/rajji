package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.google.com");
	//images: img
//    links: a
	// elements: div, input. select, li 
	
	// number of images, links, elements with div, input
	
	List<WebElement> l1 = driver.findElementsByTagName("img");
	System.out.println("Number of images "+ l1.size());
	
	List<WebElement> l2 = driver.findElementsByTagName("a");
	System.out.println("Number of links "+ l2.size());
	
	List<WebElement> l3 = driver.findElementsByTagName("input");
	System.out.println("Number of elements with input tag "+ l3.size());
	
List<WebElement> l11 = driver.findElementsByTagName("div");
	System.out.println("Number of elements with div "+ l11.size());
	
	driver.quit();
}
}
