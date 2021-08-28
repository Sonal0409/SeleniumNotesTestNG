package instructrScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling {
	
	@Test
	public void scrolling() throws InterruptedException
	{
		
       WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
		Thread.sleep(2000);
		
		// To scroll until the element is visible
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
/*		js.executeScript("scroll(0,1000)");
		
		Thread.sleep(2000);
		
		js.executeScript("scroll(0,-300)");*/
		

			WebElement e= driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
		//executeScript("arguments[0].click()", webElement); 
		//to work you need to have the webElement defined. executeScript() method will take the reference of the element as arguments[0] along with the method to be performed [in this case click() ] 
	//and the reference should be provided thereafter	
			
			js.executeScript("arguments[0].scrollIntoView(true);", e);
			
			e.click();
	}

}
