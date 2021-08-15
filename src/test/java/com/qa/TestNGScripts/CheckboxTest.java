package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxTest {
	
	// TestNG annotations : @Test : it is called as a Test method and it can be executed using testNG
	
	@Test
	public void checkboxTestmethod() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
	boolean display=driver.findElement(By.xpath("//*[@class='Example'][1]/descendant::input[1]")).isDisplayed();
		
	System.out.println("the checkbos is displyed on the page: "+ display);
	
	boolean enable= driver.findElement(By.xpath("//*[@class='Example'][1]/descendant::input[1]")).isEnabled();
	
	System.out.println("the checkbox is enabled: "+ enable);
	
	boolean check=driver.findElement(By.xpath("//*[@class='Example'][1]/descendant::input[1]")).isSelected();
	
	System.out.println("the checkbox is selected: "+ check);  // output will be false
	
		
		driver.findElement(By.xpath("//*[@class='Example'][1]/descendant::input[1]")).click();
		
		boolean check1=driver.findElement(By.xpath("//*[@class='Example'][1]/descendant::input[1]")).isSelected();
		
		System.out.println("the checkbox is selected: "+ check1);  // output will be true
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='Example'][1]/descendant::input[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='Example'][1]/descendant::input[4]")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
