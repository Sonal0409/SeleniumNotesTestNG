package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
	@Parameters({"browser","URL"})
	@BeforeClass
	public void OpenBrowser(String browser, String URL)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.get(URL);
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.get(URL);
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\vishal mittal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			 driver = new EdgeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.get(URL);
		}
		
	}
	
	@Parameters({"input1"})
	@Test(priority='1')
	public void TestWikiHomePage(String input1) throws InterruptedException
	{
		WebElement e1= driver.findElement(By.id("searchInput"));
		e1.sendKeys(input1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
	}
	

}
