package TestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PorpertiesFileLogin.ReadDetails;

public class testNG 
{
	WebDriver driver= null;
	
	
	@BeforeMethod
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void loginTc () throws IOException, InterruptedException
	{
		ReadDetails f = new ReadDetails();
		
		WebElement usr =f.getElementRef("username", driver);
		usr.sendKeys("John");
		
		f.getElementRef("password", driver).sendKeys("Micheal");
		
		Thread.sleep(2000);
	
	    f.getElementRef("login", driver).click();
		


	}
	
}
