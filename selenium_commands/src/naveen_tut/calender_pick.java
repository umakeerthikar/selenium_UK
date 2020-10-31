package naveen_tut;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender_pick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");

		WebElement date = driver.findElement(By.xpath("//input[@type='text']"));
		
		String datesel = "28-May-1995";
		
		selectDatebyjs(driver,date,datesel);
	}
	
public static void selectDatebyjs(WebDriver driver,WebElement ele, String dateval) {
	
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", ele);
	
	
}

}
