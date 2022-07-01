package GitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubDemo {

	public static void main(String[] args) {
		System.out.println("github");
		
		System.setProperty("webdriver.gecko.driver", "/Users/naj/Drivers/geckodriver/");
		WebDriver driver = new FirefoxDriver();
		System.out.println("hello everyone");
		driver.close();
		
		

	}

}
