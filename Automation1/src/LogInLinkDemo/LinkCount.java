package LogInLinkDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LinkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/naj/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		List<WebElement> allEle = driver.findElements(By.tagName("a"));
		// List<String> a = new ArrayList<String>();
		// if you want to find out how many links are in facebook page you can go with
		// size method. assign to int
		int cnt = allEle.size();
		System.out.println(cnt);
		// if you want to know the name of these links then you need to use forloop
		// concept.
		// if you want be sure your methods works for ever and keep counting the links
		// on the page
		// you should add your veritable in forloop instead of the number 47

		for (int i = 0; i < cnt; i++)

		// for(int i =0; i<47 ;i++)

		{

			String txt = allEle.get(i).getText();
			System.out.println(txt);
			// or you dont need to assign it to a string type veritable you can call in
			// sysout.
			// System.out.println(allEle.get(i).getText());

		}
	}

}
