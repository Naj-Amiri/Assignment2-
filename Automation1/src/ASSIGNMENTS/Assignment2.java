package ASSIGNMENTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assignment2 {


	public static void main(String[] args) {
		
		// Facebook page used asseration to validate the page and create new account.
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.fb.com");
		//System.out.println(driver.getCurrentUrl());
		// verify the current - Im not sure if this is correct or not. we need to discuss about it.
		
		Assert.assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
		
		//driver.findElement(By.linkText("Create new account")).isDisplayed();
		System.out.println(driver.findElement(By.linkText("Create new account")).isDisplayed());
		//System.out.println(driver.findElement(By.linkText("Create new account")).getText());
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Moh");
		driver.findElement(By.name("lastname")).sendKeys("Amiri");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("510-888-1990");
		driver.findElement(By.id("password_step_input")).sendKeys("nothing");
		driver.findElement(By.xpath("//option[contains(text(),'Feb')]")).click();
		driver.findElement(By.xpath("//option[@value='7'][contains(text(),'7')]")).click();
		driver.findElement(By.xpath("//option[@value='1981']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		// need verification of the page last part of the assignment 2.
		
		
		
		
	}

}
