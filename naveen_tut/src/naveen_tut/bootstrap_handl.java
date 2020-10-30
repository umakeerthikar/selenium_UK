package naveen_tut;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap_handl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[contains(@class,'multiselect-selected-text')]")).click();
	List<WebElement> lst =driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
	System.out.println(lst.size());
	
	for(int i=0; i<lst.size();i++)
	{
		System.out.println(lst.get(i).getText());
		if(lst.get(i).getText().contains("Angular"))
		{
			lst.get(i).click();
		}
	}

	}

}
