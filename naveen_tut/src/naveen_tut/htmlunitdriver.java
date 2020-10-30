package naveen_tut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunitdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		// download html unit driver jar file for using htmlunitdriver. It is also called ghost driver or headless browser
	
		//not suitable for mouse actions, double click
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://ui.freecrm.com/");
		System.out.println("title before login"+driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
        System.out.println("title after login"+driver.getTitle());
	}

}
