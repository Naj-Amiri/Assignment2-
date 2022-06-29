package LogInLinkDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		// driver.findElement(By.linkText("Forgot password?")).click();

		// driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.partialLinkText("Create new account")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("privacy-link")).click();

		driver.quit();

	}
}
