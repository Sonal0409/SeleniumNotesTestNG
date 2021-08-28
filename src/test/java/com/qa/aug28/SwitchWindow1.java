package com.qa.aug28;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchWindow1 {

	
	@Test
	public void SwitchwindowTest()
	{
		WebDriver driver = new ChromeDriver();
		
	 driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	
	 driver.manage().window().maximize();
	WebElement e1= driver.findElement(By.id("win2"));
	
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("arguments[0].scrollIntoView(true)", e1);
	e1.click();
	
	 Set<String> handler= driver.getWindowHandles();
	
	
	Iterator<String> itr=handler.iterator();
	
	String parentwindow= itr.next();
	System.out.println(parentwindow);
	
	String childwindow= itr.next();
	System.out.println(childwindow);
	
	driver.switchTo().window(childwindow);
	
	System.out.println("the title of pop up window is :" + driver.getTitle());
	
	driver.switchTo().window(parentwindow);
	
	System.out.println("the title of parent window is :" + driver.getTitle());
	
	
	
	
	
	
	
	
	
	
	
	}
}
