package instructrScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFramesDemo {
	
	@Test
	public void FrameDemoTest() throws InterruptedException
	{
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			Thread.sleep(2000);
			
			
			driver.switchTo().frame("packageListFrame");
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
			
			
			Thread.sleep(2000);
			
			driver.switchTo().parentFrame();
			
			//driver.switchTo().defaultContent();
			
			driver.switchTo().frame("classFrame");
			
			driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
			////*[@id="n-contents"]/a
			

	}



	}


