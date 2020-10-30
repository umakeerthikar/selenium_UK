package naveen_tut;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelemnts_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.myntra.com/");
		
		List <WebElement> lst= driver.findElements(By.tagName("a"));
		System.out.println(lst.size());
		
		for(int i=0;i<lst.size();i++)
		{
			String txt=lst.get(i).getText();
			System.out.println(txt);
	}

}
}