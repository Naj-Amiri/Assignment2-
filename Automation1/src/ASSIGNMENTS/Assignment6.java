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
		// 1st Step we have to create an object for Actions 
		Actions action = new Actions(driver);
		
		//2nd get the frame element and and switch the driver to frame becuse inside the frame we have to do the drag and drop
		WebElement fram = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(fram);
		
		// 3rd get the dragable element
		WebElement drag = driver.findElement(By.id("draggable"));
		//4th get the dropable element
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		// 5th Use the action class (dragAndDrop method) and put the perform
		action.dragAndDrop(drag, drop).perform();
		// action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		// action.dragAndDrop(drag, drop).perform();

	}

}
