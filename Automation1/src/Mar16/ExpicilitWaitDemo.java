package Mar16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpicilitWaitDemo {

	private static final String Duraiotn = null;
	private static final String ExpectedContitions = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(4));

		// driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement user = driver.findElement(By.id("email"));
		// w.unti(ExpectedContitions))
		user.sendKeys("user1");

		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("test");

		WebElement Log = driver.findElement(By.name("login"));
		Log.click();

	}
}
