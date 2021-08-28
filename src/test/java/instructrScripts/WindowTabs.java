package instructrScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowTabs {
	
	@Test
	public void tabsdemo() throws InterruptedException, AWTException
	{
WebDriver driver;
		
		driver= new ChromeDriver();
		
		//For authentication password
		//driver.get("https:username1:password1@//selenium.dev/selenium/docs/api/java/index.html");
		
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
		
		Robot robot = new Robot();   
		
		// keyPress  and keyRelease
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		/*robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_T); */
		/*robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyRelease(KeyEvent.VK_T);*/
		
		


		Thread.sleep(2000);
		
		//Switch focus to new tab
		
		// getWindowHandles()
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		Thread.sleep(2000);
		System.out.println(tabs);
		
		driver.switchTo().window(tabs.get(1));
		
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
		
		
		driver.switchTo().window(tabs.get(0));
		
		driver.get("https://jqueryui.com/droppable/");
		driver.quit();
	}
	
	}


