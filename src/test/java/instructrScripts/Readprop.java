package instructrScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readprop {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// How to read property file:
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\vishal mittal\\workspace\\8.30PMSeleniumTestNG\\src\\test\\java\\com\\Utility\\config.properties");

		
		prop.load(ip);
		
		
	String browsername= prop.getProperty("browser");
		
	System.out.println(browsername)	;
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
	
		String urlname= prop.getProperty("url");
		driver.get(urlname);
		
		driver.findElement(By.id("searchInput")).sendKeys(prop.getProperty("inputvalue"));
		
		driver.close();
		
		
		
		
		
	}

}
