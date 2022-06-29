package Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class envoirmentDemo {
	WebDriver driver;

	@Parameters({ "browser", "URL" })

	@Test
	public void Launch(String browser, String URL) {
		
		switch (browser) 
		{
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

			driver = new ChromeDriver();
			
			break;

		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "/Users/naj/Drivers/geckodriver");

			driver = new FirefoxDriver();

		default:
			System.out.println("Invalid Browser selected...");

		}

		driver.get(URL);
	}
}
