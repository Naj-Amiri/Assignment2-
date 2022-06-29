package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		Actions act = new Actions(driver);

		WebElement el1 = driver.findElement(By.xpath("//div[@class ='nav-line-1-container']"));
		WebElement el2 = driver.findElement(By.xpath("//span[text()='Watchlist']"));
		act.moveToElement(el1).moveToElement(el2).click().build().perform();

	}

}

