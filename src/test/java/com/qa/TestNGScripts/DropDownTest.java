package com.qa.TestNGScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest {
	
	// make driver object as global so that every method in current class can use the session
	
	WebDriver driver = new ChromeDriver();
	
	@Test(priority='1')
	public void dropdownCheck() throws InterruptedException
	{
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		
		WebElement e = driver.findElement(By.xpath("//select[@name='coffee']"));
		
		Select dd = new Select(e);
		
		dd.selectByIndex(2);
		
		Thread.sleep(3000);
		
		dd.selectByValue("regular");
		
		Thread.sleep(3000);
		
		dd.selectByVisibleText("With cream");
		
		
	List<WebElement>li= dd.getOptions();
		
	
	System.out.println(li.size());
	
		
		}
	
	@Test(priority='2')  // Test methods
	public void InputboxDemo() throws InterruptedException
	{
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		WebElement e1= driver.findElement(By.id("searchInput"));
		
		boolean dis= e1.isDisplayed();
		System.out.println("is the element displayed: "+ dis);
		

		boolean en= e1.isEnabled();
		System.out.println("is the element displayed: "+ en);
		
		e1.clear();
		
		e1.sendKeys("Selenium Automation");
		
		String inputvalue= e1.getAttribute("value");
		
		System.out.println(inputvalue);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	System.out.println(	driver.getCurrentUrl());
		
	System.out.println(	driver.getTitle());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
