package Mar16;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		// driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("user1");

		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("test");

		WebElement Log = driver.findElement(By.name("login"));
		Log.click();

	}

}
