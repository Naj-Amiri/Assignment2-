package LogInLinkDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement Usr = driver.findElement(By.id("username"));
		Usr.sendKeys("mercury");

		WebElement Pws = driver.findElement(By.id("password"));
		Pws.sendKeys("mercury");

		WebElement Sub = driver.findElement(By.name("submit"));
		Sub.click();

		driver.quit();

	}
}
