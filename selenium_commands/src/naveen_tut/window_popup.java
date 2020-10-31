package naveen_tut;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.partialLinkText("PopUp #3")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentwindow = it.next();
		System.out.println("parentwindow"+parentwindow);
		String childwind = it.next();
		System.out.println("childwind"+childwind);
		
		driver.switchTo().window(childwind);
		System.out.println("child window title"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindow);
		System.out.println("parent window title"+driver.getTitle());
		
		
		
		
		

	}

}
