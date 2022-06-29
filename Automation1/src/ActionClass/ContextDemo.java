package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		Actions act = new Actions(driver);

		WebElement img1 = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));

		// act.moveToElement(img1).contextClick().build().perform();

// if you want to change the position of your right click you can give it coordinates.
// by using mofetoelement with int value.

		// act.moveToElement(img1, 35, 35).contextClick().build().perform();

// and you want to do right based on the image coordination you use get location and then 
//get x and get y int.

		int x = img1.getLocation().getX();
		int y = img1.getLocation().getY();
		act.moveByOffset(x, y).contextClick().build().perform();

	}

}

