package LogInLinkDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("user1");

		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("test");

		// u_0_d_fO---- u_0_d_KN ID has be change every single time you refresh it .
		// that is why we should go by name and log in.

		WebElement Log = driver.findElement(By.name("login"));
		Log.click();

		if (driver.getTitle().matches("facebook"))
			;
		{
			System.out.println("Valid...");

		}
		// driver.quit();

	}

}

