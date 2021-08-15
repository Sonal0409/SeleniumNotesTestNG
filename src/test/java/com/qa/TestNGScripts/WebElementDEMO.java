package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementDEMO {
	
	@Test
	public void RadioButtontest() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
		WebElement e= driver.findElement(By.xpath("//blockquote[@class=\"Example\"][2]/descendant::input[3]"));
		
		boolean display= e.isDisplayed();
		System.out.println("IS the element Displayed" + display); // true
		
		 boolean enable= e.isEnabled();
		 System.out.println("IS the element Enabled" + enable); // true
		 
		boolean sel= e.isSelected();
		 System.out.println("IS the element selected" + sel); // false
		 
		 e.click();
		 
		 Thread.sleep(3000);
		 
		boolean sel1= e.isSelected();
		System.out.println("IS the element selected" + sel1); // true 
		 
		 WebElement e1 = driver.findElement(By.xpath("//blockquote[@class=\"Example\"][2]/descendant::input[1]"));
		
		 e1.isDisplayed();
		 e1.isEnabled();
		 e1.isSelected();
		 e1.click();
		
		 Thread.sleep(2000);	
		
	}

}
