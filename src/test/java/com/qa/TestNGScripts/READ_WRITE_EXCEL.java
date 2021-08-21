package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Utility.Xls_Reader;

public class READ_WRITE_EXCEL {
	
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
	@Test()
	public  void wikipagedata()
	{
		// Create a colum in the script for writing the status of test case
		
		reader.addColumn("Sheet1", "Status");
		
		// count number of rows that have data in the sheet
	int rowCount=reader.getRowCount("Sheet1");
	
	for(int i=2; i<rowCount; i++)
	{
		
          String name=reader.getCellData("Sheet1", "Username", i);
          String password=reader.getCellData("Sheet1", "Password", i);
          String retype= reader.getCellData("Sheet1", "Retype", i);
          String email=	reader.getCellData("Sheet1", "Email", i);	
		driver.findElement(By.id("wpName2")).clear();	
		driver.findElement(By.id("wpName2")).sendKeys(name);	
		driver.findElement(By.id("wpPassword2")).clear();
		driver.findElement(By.id("wpPassword2")).sendKeys(password);
		driver.findElement(By.id("wpRetype")).clear();
		driver.findElement(By.id("wpRetype")).sendKeys(retype);
		driver.findElement(By.id("wpEmail")).clear();
		driver.findElement(By.id("wpEmail")).sendKeys(email);
		
		reader.setCellData("Sheet1", "Status", i, "Pass");
	}
	}

}
