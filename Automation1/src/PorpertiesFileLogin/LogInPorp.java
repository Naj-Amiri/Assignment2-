package PorpertiesFileLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInPorp {
	
	@Test
  public void LogIn () 
  {
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		ReadDetails f = new ReadDetails(); 
  }
	
}
