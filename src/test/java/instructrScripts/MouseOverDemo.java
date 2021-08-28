package instructrScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverDemo {

	
	@Test
	public void MouseoverTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Actions obj= new Actions(driver);
		
		//WebElement e=driver.findElement(By.id("nav-link-accountList"));
		
		WebElement e1= driver.findElement(By.xpath("//*[@class='nav-line-1-container']//following::span[1]"));
		
		// mouse over-- to move to an element moveToElement(), build , perform
		
		obj.moveToElement(e1).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='nav-al-container']//descendant::a[10]")).click();
	}
}
