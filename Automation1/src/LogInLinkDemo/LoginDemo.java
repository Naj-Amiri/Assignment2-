package LogInLinkDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mykelseyonline.com/MyChart/Authentication/Login?");

		WebElement usr = driver.findElement(By.id("Login"));
		usr.sendKeys("test2");

		WebElement Pws = driver.findElement(By.id("Password"));
		Pws.sendKeys("try");

		Thread.sleep(2000);

		WebElement log = driver.findElement(By.name("submit"));
		log.click();

		driver.quit();

	}
}
