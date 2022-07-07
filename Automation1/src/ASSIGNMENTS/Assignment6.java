package ASSIGNMENTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Recup Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement fram = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(fram);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		action.dragAndDrop(drag, drop).perform();
		// action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		// action.dragAndDrop(drag, drop).perform();

	}

}
