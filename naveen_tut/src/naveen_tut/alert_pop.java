package naveen_tut;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_pop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert at= driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(at.getText());
		String txt = at.getText();
		if(txt.equalsIgnoreCase("please enter a valid user name"))
			System.out.println("correct pop");
		
		else
			System.out.print("wrong pop");
		at.accept();//at.dismiss();
		
		
	}

}
