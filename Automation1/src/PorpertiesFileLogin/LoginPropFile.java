package PorpertiesFileLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPropFile {

		public static void main(String[] args) throws IOException, InterruptedException{
			System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.facebook.com");
			
			ReadDetails f = new ReadDetails();
			
			WebElement usr =f.getElementRef("username", driver);
			usr.sendKeys("John");
			
			f.getElementRef("password", driver).sendKeys("Micheal");
			Thread.sleep(2000);
			
			System.out.println("test..");
		
			f.getElementRef("login",driver).click();
			

	}
		

}
