import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	
	 
	public static void main(String[] args) throws IOException {
		//----to get the path of the project----
		 String downloadpath=System.getProperty("User.dir");
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
       ChromeOptions options=new ChromeOptions();
       options.setExperimentalOption("prefs", value);
       
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.className("l3tlg0-0")).click();
		Runtime.getRuntime().exec("path of exe file.exe");
		//-------TO CHECK THE FILE IS DOWNLOADED------
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("kTVves")));
		driver.findElement(By.className("kTVves")).click();
		//---giving the project path to file-----
		File f=new File(downloadpath+"/downloadedfilename");
		if(f.exists()) {
			
			System.out.println("the is file is downloaded successfully");  
		}
		
		
		
		
		

	}

}
