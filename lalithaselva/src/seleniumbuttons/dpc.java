package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class dpc {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	
	driver.switchTo().frame(0);
	
	//date bx
	driver.findElementById("datepicker").click();
	
	//month select
	for(int i=0;i<3;i=i+1)
	{
		driver.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
	}
	
	//selectin date
	driver.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(5) > a").click();
}
}
