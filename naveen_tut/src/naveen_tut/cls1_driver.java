package naveen_tut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cls1_driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://ntatpcsr.in/login/");
driver.wait(40);
driver.findElement(By.id("username")).sendKeys("uma");
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("p@ss");
driver.findElement(By.linkText("forgot password")).click();

	}

}
