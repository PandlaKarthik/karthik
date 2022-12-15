import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
	public static void main(String args[]) throws InterruptedException { 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.className("red-arrow-btn")).click();
	driver.findElement(By.xpath("//a[@value='JLR']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	
}
}