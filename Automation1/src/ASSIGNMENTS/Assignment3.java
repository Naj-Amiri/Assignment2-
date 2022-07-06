package ASSIGNMENTS;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		
		//needs to methods count the links on web page and print link text and urls. 
		// I can't go forward.
		
		System.setProperty("webdriver.chrome.driver","/Users/naj/Drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		String url = "https://www.flikart.com";
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		//List<WebElement> links = driver.findElement(By.tagName("a")).getSize();
		
		//System.out.println(driver.findElement(By.tagName("a")).getSize());
		
		
		
		
	}

}
