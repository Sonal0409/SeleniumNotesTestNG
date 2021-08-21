package com.qa.TestNGScripts;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.Xls_dataProvider;

public class DataDrivenTestingPOI {

	public static WebDriver driver;
	
	@BeforeClass
public static void setup()
{
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (22)\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();  // maximize the browser window
driver.manage().deleteAllCookies();  // delete cookies on the browser
driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium		+%28software%29");
}	
	@Test(dataProvider="testdata")
	public  void wikipagedata(String name, String password, String retype, String email)
	{
		driver.findElement(By.id("wpName2")).clear();	
		driver.findElement(By.id("wpName2")).sendKeys(name);	
		driver.findElement(By.id("wpPassword2")).clear();
		driver.findElement(By.id("wpPassword2")).sendKeys(password);
		driver.findElement(By.id("wpRetype")).clear();
		driver.findElement(By.id("wpRetype")).sendKeys(retype);
		driver.findElement(By.id("wpEmail")).clear();
		driver.findElement(By.id("wpEmail")).sendKeys(email);
	}

	@DataProvider(name="testdata")
	public Object[][] readExcel() throws Exception 
	{
	    
		Object input[] []=Xls_dataProvider.getTestData("Sheet1");
		
		return input;	
		
		
	}
	     
}
