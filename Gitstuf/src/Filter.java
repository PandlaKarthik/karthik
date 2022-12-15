import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        //---storing 5 webElement into list----
        List<WebElement>list=driver.findElements(By.xpath("//tr/td[1]"));
        //---text is retrieved from webElements-----
        List<WebElement> FilteredList=list.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
        //-----after completing this step 1 result is stored in filteredList-----
        Assert.assertEquals(list.size(),FilteredList.size());
        

	}

}
