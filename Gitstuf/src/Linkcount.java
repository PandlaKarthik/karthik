import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
			//------- to get count of no of links------
			System.out.println(driver.findElements(By.tagName("a")).size());
			
			//-------to get count of no of links in footer ------
			//-------limiting webdriver scope by footerdriver-----
           WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
           System.out.println(footerdriver.findElements(By.tagName("a")).size());
           
           //---- to get count of no of links in footer single column ------
           WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
           System.out.println(columndriver.findElements(By.tagName("a")).size());
           //----to check all the links are working by clicking on each link-----
           
           for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
        	   
        	   //------to open page in next tab----
        	   String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
        	   
        	   
        	   columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
        	   Thread.sleep(5000L);
           }//----- for loop opens all the tab-----
        	   
        	   Set<String> set=driver.getWindowHandles();
        	   Iterator<String> it=set.iterator();
        	   
        	   //---- gives the titles of the pages----
        	  
        	  while(it.hasNext()) {
        		  
        		  driver.switchTo().window(it.next());
        		  System.out.println(driver.getTitle());
        	  }
        	   
           
	}

}
