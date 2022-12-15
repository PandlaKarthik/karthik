import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//-----JS is used for scrolling ----
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//------for scrolling the page-----
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		//-----for scrolling single element in the page-------
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		//-----for adding the elements in the row -------
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0;i<values.size();i++) {
			
			sum = sum + Integer.parseInt(values.get(i).getText());//adding the elements one by one
			
		}
		
		System.out.println("The sum is :"+sum);
		
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		//-----to parse the string and convert text to integer----
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		//-----compares if true, executed or else execution fails----- 
		Assert.assertEquals(sum, total);

		
	}

}
