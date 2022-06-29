package Mar16;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenDemo {

	// static WebDriver driver

	// void Screenshot()
	// {
	// File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// interview

	// to save your screenshot in your drivers you need to use (FileUtils)
	// FileUtils// donwload the jar files for FileUtils

	// File f2 = new File("/Automation1/src");
	// FileUtils.copyFile(f1, f2);

//	}
//	void screen2()
//		{
//		Date d = new Date();
//		DateFormat df = new SimpleDateForame("yy")
//		}

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		// driver= new ChromeDriver();

		// driver.get("https://www.facebook.com");
	}

}
