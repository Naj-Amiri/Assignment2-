package ASSIGNMENTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("moh.amiri510@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("KBL123@@");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		driver.findElement(By.name("to")).sendKeys("qatesting@vitsconsulting.c.om");
		driver.findElement(By.name("subjectbox")).sendKeys("QA Automation Test Mail");
		driver.findElement(By.cssSelector("div[aria-label='Message Body']")).sendKeys("Assignment number 7 completed. Thanks Moh");
		driver.findElement(By.className("dC")).click();
		System.out.println("Email has been Sent");
		driver.quit();
		
		
		

	}

}
