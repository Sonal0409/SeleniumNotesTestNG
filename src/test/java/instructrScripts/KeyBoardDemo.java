package instructrScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeyBoardDemo {
	
	public WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
	}
	
	@Test
	public void keysDemo()
	{
		WebElement e1 = driver.findElement(By.id("searchInput"));
		Actions action = new Actions(driver);
		
		action.moveToElement(e1).keyDown(e1,Keys.SHIFT).sendKeys("selenium Automation")
		.keyUp(e1,Keys.SHIFT).pause(2)
		.doubleClick(e1)
		.contextClick(e1)
		.sendKeys(Keys.RETURN).build().perform();;
		
	}
	
	
	
	
	
	/*@Test
	public void doubleclickTest()
	{
	//double click
	                                   
	//action.doubleClick(e).build().perform();
	Thread.sleep(3000);
	//right click on an element
	action.contextClick(e1).build().perform();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	action.contextClick(driver.findElement(By.linkText("Draggable"))).build().perform();
	}*/
}
