package com.qa.TestNGScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ParameterizationJXL {

	WebDriver driver;
	
	@BeforeClass
	
    public  void startbrowser()
    {
   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (22)\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();  // maximize the browser window
  driver.manage().deleteAllCookies();  // delete cookies on the browser
  driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium		+%28software%29");
       }	
	
	@Test(dataProvider="testdata",priority='1')
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
	public Object[][] readExcel() throws BiffException, IOException
	{
		// Location of the file
		
		File f= new File("C:\\Users\\vishal mittal\\Desktop\\mydata.xls");
		
		// Fetch the workbook
		
		Workbook w= Workbook.getWorkbook(f);
		
		// Fetch the sheet
		
		
		Sheet s=w.getSheet("Sheet1");
		
		// in the sheet count number of rows and colms that have data
		
	int rows=	s.getRows(); //21
	
	System.out.println("number of rows with data in sheet"+ rows);
		
	int col= s.getColumns();  //4
		
	System.out.println("number of columns with data in sheet"+ col);	
		
	// declare an array
	// String arr1[] = new String [4]
	// String arr2[] []= new String [4][3]
	 // arr2 [] [] ={{us1.pass1,email1},{us2,pass2,email2},{us3,pss3,email3},{us3,pss3,email3}}
	
	Object inputData [] []= new Object[rows][col];
	
	for(int i=0 ; i<rows; i++)
	{
		for(int j=0; j<col; j++)
		{
			// get the cell
			
			Cell c=s.getCell(j, i);
			
		inputData[i][j]=c.getContents();
			
		}
		
	}
		
	return inputData;	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
