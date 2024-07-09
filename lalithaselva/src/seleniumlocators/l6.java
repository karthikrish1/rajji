package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.mycontactform.com");
		
		//xpath: xml path lanugauge
		
		//absolute xpath:  
		// starts with /
		// copy=> copy full xpath
		
	
		//driver.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
	
	//relative xpath: starts with //
		// syntax:copy=> copt xpath
		
		//driver.findElementByXPath("//*[@id=\"user\"]").sendKeys("hi");
		
		//syntax: //*[@loc/attribute='value']
		
		//id=user
		driver.findElementByXPath("//*[@id='user']").sendKeys("hi");
		
		//type=password
		driver.findElementByXPath("//*[@type='password']").sendKeys("hello");
	
	
	
	
	
	
	}

}
