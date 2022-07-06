package ASSIGNMENTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment4 {

	public static void main(String[] args) {
		
		// ebay website == done in my prospect .
		
		System.setProperty("webdriver.chrome.driver","/Users/naj/Drivers/chromedriver");
		
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			driver.get("https://www.ebay.com/");
			//driver.findElement(By.cssSelector("input[Placeholder='Search for anything']")).sendKeys("Apple Watch");
			//driver.findElement(By.xpath("//input[@Placeholder='Search for anything']")).sendKeys("Apple Watch");
			driver.findElement(By.name("_nkw")).sendKeys("Apple Watch");
			driver.findElement(By.name("_sacat")).click();
			driver.findElement(By.cssSelector("option[value='58058']")).click();
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			System.out.println("Done");
			

	}

}
