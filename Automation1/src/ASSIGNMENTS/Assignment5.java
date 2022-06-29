package ASSIGNMENTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		
		//vitshr web site register a company not completed. 
	
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		String url = "http://www.vitshr.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("companyName")).sendKeys("Moh LLC");
		driver.findElement(By.cssSelector("input[name='companyWebsite'")).sendKeys("www.MohLLC.com");
		driver.findElement(By.xpath("//input[@name='phoneNo']")).sendKeys("5103987029");
		//driver.findElement(By.xpath("//input[@name='phoneNo']")).click();
		// index x path counting the number of spaces on the page if possible .
		// com name,com web,phon,com add. is located on 4th place we can add index number 4 to find element.
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter a location']")).sendKeys("1930 Wright St, Sacramento, CA,95825,USA");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[aria-label='close']")).click();
		//driver.findElement(By.xpath("(//span[@class='MuiTouchRipple-root'])[7]")).click();
		driver.findElement(By.name("otherNo")).sendKeys("5103878879");
		driver.findElement(By.name("zipcode")).sendKeys("95824");
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
		driver.findElement(By.name("fbId")).sendKeys("najeeb Amiri");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.cssSelector("input[name='fein']")).sendKeys("989-098-0091");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("0070");
		driver.findElement(By.name("email")).sendKeys("n.amiri@gmail.com");
		driver.findElement(By.xpath("//input[@name='loginId']")).sendKeys("Naj.Amiri");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12343Q@");
		driver.findElement(By.className("MuiButton-label")).click();
		//can not successfully sign up 2 errors (location and phone number).	
		
				
		
		
		
				
		
			
		
	}

}
