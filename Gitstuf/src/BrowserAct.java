import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAct {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("https://pep.prolifics.com/login");
		driver.navigate().back();
		driver.navigate().forward();
		
	}
}
