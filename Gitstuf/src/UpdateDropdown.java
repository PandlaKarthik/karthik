import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class UpdateDropdown {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//-------- Assertions ----------
		
//		Assert.assetFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click());
//		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click());
//		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();


		//--------- to select the check box -----------
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//----------  to count the number of check boxes   -----------	
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);	
//		int i= 1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}	
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		    i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
	
	}
}
