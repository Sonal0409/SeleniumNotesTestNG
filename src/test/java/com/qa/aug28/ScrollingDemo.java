package com.qa.aug28;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingDemo {
	
	@Test
	public void ScrollingTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// first inspect the listbox
		
		//Select sel = new Select(driver.findElements(By.xpath("listbox"))
		//JavascriptExecutor js = ((JavascriptExecutor) sel);
		//js.executeScript("scroll(0, -600)");*/
		
		
		// Add scrolling steps - Method1
		
		/* JavascriptExecutor js = ((JavascriptExecutor) driver);
		
	    js.executeScript("scroll(0, 2000)");
		
		Thread.sleep(3000);
		
		js.executeScript("scroll(0, -600)");*/
		
		// Add scrolling steps - Method2
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		WebElement e = driver.findElement(By.xpath("//*[@id=\"platforms-supported-by-selenium\"]/div/div/p[2]/button"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", e);
		
		e.click();
		
		
		
		
	
	
		
	}

}
