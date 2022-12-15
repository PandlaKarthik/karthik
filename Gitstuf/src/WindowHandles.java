import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://rahulsheettyacademy.com/lginpagePractice/");
        driver.findElement(By.xpath(".blinkingText")).click();
        Set<String>windows= driver.getWindowHandles();
        Iterator<String> it= windows.iterator();
        String parentId=it.next();
        String childId=it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        driver.findElement(By.cssSelector(".im-para.red")).getText();
        
        //-------- To parse the required text from one window and enter into next window--------
        String EmailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(EmailId);
        
}
}