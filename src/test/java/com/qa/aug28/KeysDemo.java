package com.qa.aug28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeysDemo {

	@Test
	public void keysTest()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("searchInput"));
		WebElement e2= driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button"));
		Actions action = new Actions(driver);
		
		action.moveToElement(e1).keyDown(e1, Keys.SHIFT).sendKeys("seleniumautomation")
		.keyUp(e1, Keys.SHIFT)
		.doubleClick(e1)
		.contextClick(e1).pause(4)
		.sendKeys(Keys.RETURN)
		.build().perform();
	}
	
	
	
	
	
}










