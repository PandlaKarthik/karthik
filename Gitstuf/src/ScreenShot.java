 import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class ScreenShot {
	public static void main(String args[]) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//---to delete the cookies---
		//driver.manage().deleteAllCookies();
		//---to delete a specific cookie----
		//driver.manage().deleteCookieNamed("SessionKey"); 
		
		driver.get("http://google.com");
		
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //-----create a new folder and give path SC stores in that file----
	    FileUtils.copyFile(src,new File("C:\\Users\\KPandla\\Downloads\\Grid"));		
	    	
		
	}
}
