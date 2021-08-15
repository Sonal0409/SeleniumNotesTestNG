package instructrScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	public void CrossbrowserTest(String browser)
	{
		if(browser.equals("Chrome"))
		{
			 driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			 driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			 driver = new InternetExplorerDriver();
			driver.get("https://www.google.com");
		}
		
	}
	
	@Parameters({"input"})
	@Test(priority='1')
	public void searchInput(String input) throws InterruptedException
	{

		driver.findElement(By.xpath("//div[@class='a4bIc']/child::input[1]")).sendKeys(input);
		
		Thread.sleep(7000);
		
		List<WebElement> l1 = driver.findElements(By.xpath("//ul[@role='listbox']/child::li"));
		
		System.out.println(" total list items are: " + l1.size());
		
		for(int i=0;i<l1.size();i++)
		{
			String text=l1.get(i).getText();
			System.out.println(text);
			
			if(text.contains("careers"))
			{
				l1.get(i).click();
				break;
			}
			
		}
		
	}

}
