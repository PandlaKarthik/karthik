import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a= new SoftAssert();
		
		for(WebElement link : links) {
			
			//-----Broken URL-----		
			//----get all the URLs tied up to the links using selenium-----
			
			String url = link.getAttribute("href");
			//----java method for open connection---
			 HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			 //---you  make a call to the URL and get the Response back---- 
			 conn.setRequestMethod("HEAD");
			 conn.connect();
			 //----if status code is greater than 400 then url is not working and link tied to that url is broken---- 
			 int respCode = conn.getResponseCode();
			 System.out.println(respCode); 
			 
			 /*if(respCode>400) {
				 System.out.println("The link with text "+link.getText()+ " is broken with code " +respCode);
				 Assert.assertTrue(false); */
			 a.assertTrue(respCode<400,"The link with text "+link.getText()+ " is broken with code " +respCode);
			 Assert.assertTrue(false);
			 }
			 
													
		}
		
		
}	
		
		
		
		
		
		
	
		
		
		
		
		
	

