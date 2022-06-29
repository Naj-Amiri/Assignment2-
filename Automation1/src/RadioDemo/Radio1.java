package RadioDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio1 {
	static WebDriver driver;

	public void maleclk() {
		driver.findElement(By.xpath("//label[text()='Male'] ")).click();
	}

	public void allRadio() throws InterruptedException {
		// if you need to click and check all the radio button is working you can use
		// this is method..
		List<WebElement> allEle = driver.findElements(By.name("sex"));

		System.out.println("count is :" + allEle.size());
		for (int i = 0; i < allEle.size(); i++) {

			allEle.get(i).click();
			Thread.sleep(500);

		}

	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.partialLinkText("Create new account")).click();

		Thread.sleep(500);

		// driver.findElement(By.xpath("//label[text()='Male'] ")).click();

		// if you want to write the method inside the class we can move it from here to
		// the class and under the method
		// and declare the webdriver too in the classs.

		Radio1 r = new Radio1();

		r.allRadio();

	}

}
