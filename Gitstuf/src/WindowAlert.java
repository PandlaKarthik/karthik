import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlert {
     public static void main(String args[]){
    	 
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
 		
 		WebDriver driver = new ChromeDriver();
 		
 		//------giving username and password in link-----
 		driver.get("https://admin:admin@the-internet.herokuapp.com/");
 		driver.findElement(By.linkText("Basic Auth")).click();
 		
 		
	
}
}
