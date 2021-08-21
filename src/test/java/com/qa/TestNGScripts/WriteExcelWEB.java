package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Utility.Xls_Reader;

public class WriteExcelWEB {
	
public static WebDriver driver;
	
	Xls_Reader reader = new Xls_Reader("C:\\\\Users\\\\vishal mittal\\\\Desktop\\\\newdata.xlsx");
	
@BeforeClass
public static void setup()
{
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (22)\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();  // maximize the browser window
driver.manage().deleteAllCookies();  // delete cookies on the browser
driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium		+%28software%29");
}	
	
	@Test
	public void WriteExcel() throws InterruptedException
	{
		
		reader.addSheet("LinksData");
		
		if(reader.isSheetExist("LinksData"))
		{
			reader.addColumn("LinksData", "Text1");
			reader.addColumn("LinksData", "Text2");
		}
		
		String var1= driver.findElement(By.linkText("Main page")).getText();
		
		reader.setCellData("LinksData", "Text1", 2, var1);
		
		String var2= driver.getTitle();
		
		reader.setCellData("LinksData", "Text2", 2, var2);
		
		String var3 = driver.findElement(By.linkText("Current events")).getText();

		reader.setCellData("LinksData", "Text1", 3, var3);
		
		driver.findElement(By.linkText("Current events")).click();
		
		Thread.sleep(3000);
		
         String var4= driver.getTitle();
		
		reader.setCellData("LinksData", "Text2", 3, var4);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
