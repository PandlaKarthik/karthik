import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY4NDIzNTg0LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys("karthik@gmail.com");
		driver.findElement(By.id("password")).sendKeys("karthik");
		driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("karthik2@gmail.com");
	    driver.findElement(By.id("email")).sendKeys("pandlakarthik202@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Karthik");
		driver.findElement(By.name("login")).click();

	}

}
