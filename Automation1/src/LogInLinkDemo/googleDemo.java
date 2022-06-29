package LogInLinkDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		// driver.quit();

		String url = driver.getCurrentUrl();
		System.out.println("URL  is :" + url);
		System.out.println("Title is " + driver.getTitle());

		String title = driver.getTitle();

		// if(driver.getTitle().matches("Google"))

		if (title.matches("Google")) {
			System.out.println("vaild Page Launched");
		}
		driver.quit();

	}
}
