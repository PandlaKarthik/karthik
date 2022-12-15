import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWait {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		//WebDriverWait w = new WebDriverWait(driver,3);

	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//--------------Explicit Wait-----------
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input.promoCode")).sendKeys("karthik")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("karthik"); 
		driver.findElement(By.cssSelector("button.promoBtn")).click(); 
		//w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo")).getText()));
        	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


}
}