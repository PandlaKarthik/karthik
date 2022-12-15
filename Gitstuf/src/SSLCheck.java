import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		//-----For network behaviour Proxy------- 
		//Proxy proxy = new Proxy();
		//proxy.setHttpProxy("ipaddress:8080");
		//options.setCapability("proxy", proxy);
		
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}

}
