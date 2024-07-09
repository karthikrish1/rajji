package extr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// selecting auto selection option in auoto complete box in jquery
public class auto2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver ce=new ChromeDriver();
    ce.get("http://jqueryui.com/autocomplete/");
	//switching into the frame
    
	ce.switchTo().frame(0);
	Thread.sleep(2000);
	
	//explicit wait 
	WebDriverWait wait= new WebDriverWait(ce,4);
	//step1: identifying the box and sending value in it 
	WebElement textelement = ce.findElementById("tags");
	textelement.sendKeys("a");
	
	// identifying option box 
	WebElement autoOptions = ce.findElement(By.id("ui-id-1"));// options : box 
	// once it is appeared
	wait.until(ExpectedConditions.visibilityOf(autoOptions));
	//collecting all the options and storing in a list
	List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
	
	// iterating through it 
	for(WebElement option : optionsToSelect){
		// checking against java 
		
        if(option.getText().equals("Java")) {
        	System.out.println("Trying to select: "+"Java");
            option.click();
            break;
}
}}}
