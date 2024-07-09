package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.mycontactform.com");
	
	//css: cascade style sheet
	//manual: 7 ways 
	//shortcut: copy- copy selctor
	
	//1. tagname and id              syntax: tagname#id
	//driver.findElementByCssSelector("input#user").sendKeys("hi");
	
	//2. tagname and classname      syntax: tagname.classname
	//driver.findElementByCssSelector("input.txt_log").sendKeys("hi");
	
	//3.tagname and attribute     syntax: tagname[attribute=;'value']
	//driver.findElementByCssSelector("input[type='text']").sendKeys("hi");
	
	//4. tagname and prefix of attribute     syntax: tagname[attribute^='prefix value']
//	driver.findElementByCssSelector("input[type^='te']").sendKeys("hi");
	
	//5.tagname and suffx of attribute     syntax: tagname[attribute$='suffix value']
	//driver.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
	
	//6.tagname and substring of attribute     syntax: tagname[attribute*='subsvalue']
	//driver.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
	
	//7.tagname.classname  and attribute     syntax: tagname.classname[attribute=;'value']
	//driver.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
	
	driver.findElementByCssSelector("#user").sendKeys("hi");
	Thread.sleep(3000);
	driver.quit();
}
}
