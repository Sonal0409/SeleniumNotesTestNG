package com.qa.aug28;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabsDemo {
	
	@Test
	public void TabsTest() throws AWTException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_T);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_T);
		
	Thread.sleep(2000);	
	
     ArrayList <String> s1= new ArrayList<String> (driver.getWindowHandles());
	
	System.out.println(s1);
	
	driver.switchTo().window(s1.get(1));
	
	driver.get("https://www.wikipedia.org/");
	
	
	driver.switchTo().window(s1.get(0));
	
	
	driver.get("https://docs.ansible.com/ansible/2.8/modules/list_of_all_modules.html");
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
