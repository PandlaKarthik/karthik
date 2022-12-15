import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {
	public static void main(String args[]) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        // ---- to click on the column----
        driver.findElement(By.xpath("//tr/th[1]")).click();
        //-----capture all the web elements in column in list-----
        
        List<WebElement> originalList=driver.findElements(By.xpath("//tr/td[1]"));
        
        //----capture text from all the web elements and store in the new list-----
        
        List<String> newlist= originalList.stream().map(s->s.getText()).collect(Collectors.toList());
        
        //-----sort the original list and create original list-----
        
        List<String> sortedList =newlist.stream().sorted().collect(Collectors.toList());
        
        //-----compares the original with sorted list----- 
        
        //Assert.assertTrue(originalList.equals(sortedList));
        
        //-----scan the name column with getText and print the price of the beans---
        List<String> price;
        do {
        List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));

        price=rows.stream().filter(s->s.getText().contains("Rice")).
        map(s->getPriceVeg(s)).collect(Collectors.toList());	
        price.forEach(a->System.out.println(a));
        if(price.size()<1) {
        //----if the desired element is not in the page clicks NEXT button----- 	
        	driver.findElement(By.cssSelector("[aria-label='Next']")).click();
        }
        }while(price.size()<1);
        
	}

	private static String getPriceVeg(WebElement s) {
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
