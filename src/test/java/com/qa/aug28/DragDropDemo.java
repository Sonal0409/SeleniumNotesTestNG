package com.qa.aug28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDropDemo {

	
	@Test
	public void DragDropTest() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement e1=driver.findElement(By.id("draggable"));
		
		WebElement e2= driver.findElement(By.id("droppable"));
		
		
		
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
	//	action.dragAndDrop(e1, e2).build().perform();
		
		
	action.clickAndHold(e1).moveToElement(e2).release().build().perform();
		
		
		
		
		
		
		
		
		
	}
}
