package com.qa.keyword.actionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyworkMethods {
	
	public static WebDriver driver;
	
	public static void OpenBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public static void Navigate()
	{
		driver.get("https://www.wikipedia.org/");
	}
	
	
	public static void SearchInput()
	{
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium Automation");
	}
	
	
	public static void clickbutton()
	{
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
		
	}
	
	
	
	
	
	
	
	
	

}
