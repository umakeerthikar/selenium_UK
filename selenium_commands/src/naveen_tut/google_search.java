package naveen_tut;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class google_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");
		
	List<WebElement> list =	driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
	
	System.out.println("size of list"+list.size());
	
	for (int i=0; i< list.size(); i++)
	{
		System.out.println(list.get(i).getText());
	   if (list.get(i).getText().contains("testing time"))
	   {
		   list.get(i).click();
	   }
	}
	
	}

}
