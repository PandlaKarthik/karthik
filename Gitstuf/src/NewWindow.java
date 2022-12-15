import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.apache.commons.io.FileUtils;

public class NewWindow {
	public static void main(String argd[]) throws IOException {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			//----switch to new window-----
			driver.switchTo().newWindow(WindowType.TAB);
			//----window handles gives the the id in which window the control is----- 
			Set<String> handles =driver.getWindowHandles();
			//----iterates to next window----
			Iterator<String> it= handles.iterator();
			//----control goes to parent window----- 
			String ParentWindowId= it.next();
			//----control goes to child window----- 
			String ChildWindowId= it.next();
			//----control switches to child window----
			driver.switchTo().window(ChildWindowId);
			driver.get("https://rahulshettyacademy.com/");
			//-----extracting the course name from child window----
			String CourseName=driver.findElements(By.cssSelector("a[href*='rahulshettyacademy.com/p']")).get(1).getText();
			driver.switchTo().window(ParentWindowId);
			WebElement name= driver.findElement(By.cssSelector("[name='name']"));
			name.sendKeys(CourseName);
			//----To take a screenshot of name WebElement----
			
			//File file= name.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(file,new File("logo.png"));
			
			//----To get height and width of the WebElement----
			System.out.println(name.getRect().getDimension().getHeight());
			System.out.println(name.getRect().getDimension().getWidth());
			
			

			
					

}
}