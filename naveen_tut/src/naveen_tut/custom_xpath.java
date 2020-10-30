package naveen_tut;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class custom_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		Alert at = driver.switchTo().alert();
		at.dismiss();
		driver.findElement(By.xpath("//input[@class='text']")).sendKeys("shirts");//we can use class, name, property
	driver.findElement(By.xpath("//input[contains(@class,'test')]"));
	}
	

}
