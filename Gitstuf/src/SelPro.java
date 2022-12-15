import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelPro {
	public static void main(String args[]) {
		
		//CHROME
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://karthik.com");
		
		
		//FIREFOX
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KPandla\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://karthik1.com");
//		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.close();
		
		
        //EDGE
		System.setProperty("webdriver.edge.driver", "C:\\Users\\KPandla\\Downloads\\edgedriver_win64\\edgedrive.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://karthik1.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
