package naveen_tut;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_handl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		//for frame view page source will give fram name
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
	}

}
