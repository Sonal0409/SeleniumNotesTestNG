package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FramesDemo {
	

	WebDriver driver;
	
	@Test
	public void FrameTestDemo() throws InterruptedException
	{
   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (22)\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();  // maximize the browser window
  driver.manage().deleteAllCookies();  // delete cookies on the browser
  driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
  
  
  
  driver.switchTo().frame("packageFrame");
  
  Thread.sleep(3000);
  
  driver.findElement(By.linkText("Action")).click();
  
  driver.switchTo().parentFrame();
  
  driver.switchTo().frame("packageListFrame");
  
Thread.sleep(3000);
  
  driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
       }	
	

	

		
	
}
