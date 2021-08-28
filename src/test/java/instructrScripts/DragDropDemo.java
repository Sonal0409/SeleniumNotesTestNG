package instructrScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragDropDemo {

	public WebDriver driver ;
	
	
	
	@BeforeClass
	public void Startbrowser()
	{
          driver = new ChromeDriver();
		
	   	driver.manage().window().maximize();
		
          driver.get("https://jqueryui.com/droppable/");

	}
	
@Test
public void dragdropTest() throws InterruptedException
{
driver.switchTo().frame(0);

Actions action = new Actions(driver);

WebElement e= driver.findElement(By.id("draggable"));

WebElement e1= driver.findElement(By.id("droppable"));

Thread.sleep(2000);

// action.dragAndDrop(e, e1);

// drag and drop

// click an hold for sometime on the element 1 and  move it to another location of element 2, release, build and perform

action.clickAndHold(e).moveToElement(e1).release().build().perform();

}



}
