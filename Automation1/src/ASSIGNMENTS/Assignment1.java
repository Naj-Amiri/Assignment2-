package ASSIGNMENTS;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// VITS HR title verfication and Facebook.
		
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.manage().window().maximize();
		driver.get("https://vitshr.com");
		
		// this is just for test ...
		
		String expect="VITS HR";
		String Actual= driver.getTitle();
		
		Assert.assertEquals(Actual, expect);
		driver.get("https://www.facebook.com");
		driver.get("https://vitshr.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("done");
		driver.quit();
	
		
		
		
		
		
		
		
		
		
		

	}

}
