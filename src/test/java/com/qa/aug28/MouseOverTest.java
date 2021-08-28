package com.qa.aug28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverTest {
	
	@Test
	public void MouseOverDemo() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='layoutToolbarPadding']/child::a[2]"));
		
	    Actions obj = new Actions(driver);
	    
	    obj.moveToElement(e1).build().perform();
	    
	    
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//*[@id='nav-al-container']/descendant::a[10]")).click();
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
				
	}

}
