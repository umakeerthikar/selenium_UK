package naveen_tut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Select sel=new Select(driver.findElement(By.cssSelector("#topnavbtn_references")));
		sel.selectByVisibleText("Learn HTML");
	}

}
