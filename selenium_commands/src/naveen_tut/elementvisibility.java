package naveen_tut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementvisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://register.freecrm.com/register/");
		//is displayed
		boolean b= driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(b);//if present prints true
		
		//is enabled
		boolean b2= driver.findElement(By.name("action")).isEnabled();
	
		System.out.println(b2);
		
		//is selected only for checkbox, dropdown,radio button
		
		driver.findElement(By.id("terms")).click();
		boolean b3 = driver.findElement(By.id("terms")).isSelected();
		System.out.println(b3);
		
		driver.findElement(By.id("terms")).click();
		boolean b4 = driver.findElement(By.id("terms")).isSelected();
		System.out.println(b4);
	}
	

}
