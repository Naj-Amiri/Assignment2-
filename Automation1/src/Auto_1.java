import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Auto_1 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Safari,Driver", "usr/bin/SafariDriver");

		WebDriver driver = new SafariDriver();

		driver.get("https://www.google.com");
		// driver.navigate().to(" http://www.google.com/");

		// driver.get("https://www.amazon.com/");

	}

}
