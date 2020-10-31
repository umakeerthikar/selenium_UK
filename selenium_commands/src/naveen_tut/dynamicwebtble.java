package naveen_tut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicwebtble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[3]
		//*[@id="leftcontainer"]/table/tbody/tr[2]/td[3]
		//*[@id="leftcontainer"]/table/tbody/tr[3]/td[3]
	}

}
