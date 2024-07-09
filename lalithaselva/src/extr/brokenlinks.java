package extr;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://developer.mozilla.org/en-US/docs/Web/HTTP/Status#information_responses
public class brokenlinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");

    String url = "";
    HttpURLConnection huc = null;
    int respCode = 200;
    
    ChromeDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get( "http://www.zlti.com");
    
    List<WebElement> links = driver.findElements(By.tagName("a"));
    
    Iterator<WebElement> it = links.iterator();
    // collecitn gall the webelements that is having links using l=tagnamea
    // iterating through the elements
    // fetching all the links 
    while(it.hasNext()){
        
        url = it.next().getAttribute("href");
        
        System.out.println(url);
    
        if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
            continue;
        }
        
        if(!url.startsWith("http://www.zlti.com")){
            System.out.println("URL belongs to another domain, skipping it.");
            continue;
        }
        
        try {
            huc = (HttpURLConnection)(new URL(url).openConnection());
            
            huc.setRequestMethod("HEAD");
            
            huc.connect();
            
            respCode = huc.getResponseCode();
            
            if(respCode >= 400){
                System.out.println(url+" is a broken link");
            }
            else{
                System.out.println(url+" is a valid link");
            }
                
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    driver.quit();
	}
}
