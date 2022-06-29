package PorpertiesFileLogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadDetails 
{
	
	WebDriver diver=null;
	
public String getPropDetails(String key ) throws IOException
{
	FileInputStream file = new FileInputStream(new File ("/Users/naj/eclipse-workspace/Automation1/src/PorpertiesFileLogin/locators.Properties"));
	
	Properties p = new Properties();
	
	p.load(file);
	
	String eleDetail = p.getProperty(key);
	return eleDetail;	
	
}
public WebElement getElementRef(String key1,WebDriver driver) throws IOException
{
	this.diver=driver;
	
	WebElement ele=null;
	
	
	ReadDetails r = new ReadDetails();
	
	String value = r.getPropDetails(key1);
	
	String[] loc = value.split(":");// loc[0]=name, loc[1]= pass
	
	switch(loc[0])
	{
	case "id":
	 ele = driver.findElement(By.id(loc[1]));
	
	break;
	
	case "name":
	ele = driver.findElement(By.name(loc[1]));
	
	break;
		
	case "xpath":
		ele= driver.findElement(By.xpath(loc[1]));
		
	default:
		System.out.println("Invalid Locator Passed...");
	
	}
	return ele;	
	
}
	
}



