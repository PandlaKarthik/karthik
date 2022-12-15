import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		//------month button----
		while(!driver.findElement(By.cssSelector(" ")).getText().contains("April")){
			
			//----for next button----
			driver.findElement(By.cssSelector(" ")).click();
		}
		
		//-------selecting the date-------
		//-------grab the the common attribute put it into list and iterate--------
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day disabled"));
		int count=driver.findElements(By.className("flatpickr-day disabled")).size();
		
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.className("flatpickr-day disabled")).get(i).getText();
			
			if(text.equalsIgnoreCase("23")) {
			driver.findElements(By.className("flatpickr-day disabled")).get(i).click();
			break;
			}
			
		}
	}

}
 