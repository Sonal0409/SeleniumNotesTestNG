package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations3 {
	
	WebDriver driver;
	
	@BeforeClass   // this method will be executed as the very first method of the class and only once
	public void startmethod()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wikipedia.org/");
	}
	@Test(priority='1')
	public void TestWikiHomePage() throws InterruptedException
	{
		WebElement e1= driver.findElement(By.id("searchInput"));
		e1.sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
	}
	@Test(priority='2')
	public void ClickCreateAccount()
	{
		driver.findElement(By.linkText("Create account")).click();
	}
	
	@Test(priority='3')
	public void EnterdataTest()
	{
		String actualtitle=driver.getTitle();
		
		if(actualtitle.contains("Create account - Wikipedia"))
		{
        driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("sonal");
		
		driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("password");
					
		driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).click();
		}
		
		else
		{
			System.out.println("you are on wrong page");
		}
					
	}
	
	
	@AfterClass   // this method will be executed at the end of all the test methods
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	

}
