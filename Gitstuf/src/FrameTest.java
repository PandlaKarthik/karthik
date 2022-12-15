import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//------To switch to the Frame using WebElement -----
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.findElement(By.id("draggable")).click();
		        
		//------To know the no of frames in the page -----
		
	    System.out.println(driver.findElements(By.tagName("iframe")).size());
	    
		//------To switch to the Frame using index -----

		//driver.switchTo().frame(0);
		
		//------ Drag and Drop -------
		
		Actions a =new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		//------ To come out of frame ------
		driver.switchTo().defaultContent();
		
	}

}
