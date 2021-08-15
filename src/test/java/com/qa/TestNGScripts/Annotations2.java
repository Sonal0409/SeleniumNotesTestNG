package com.qa.TestNGScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeSuite
	public void method2()
	{
		System.out.println("method to be executed before the Suite begins");
	}
	
	@BeforeClass
	public void openBrowser353453()
	{
		System.out.println("Open the chrome browser");
	}
	
	@BeforeMethod  // this particular method will be executed before every test method
	public void login35354()

	{
		
		System.out.println("Loginto the application");
	}
	
	
	@Test(priority='1')
	public void CreateEmail13535()
	{
		System.out.println("this is code to cretae an email");
	}
	@Test(priority='2')
	public void SearchMethod12()
	{
		System.out.println("Search for an email");
	}
	
    @Test(priority='3')
	public void ModifyEmail23()
	{
		System.out.println("this is code to modify an email");
	}
	
    @Test(priority='4')
	public void DeleteEmail43()
	{
		System.out.println("this is code to delete an email");
	}
	
	@AfterMethod
	public void logout434235()
	{
		
		System.out.println("Logout the application");
	}
	
	@AfterClass
	public void closeBrowser24324()
	{
		System.out.println("Close the application");
	}
	
	@AfterSuite
	public void method3()
	{
		System.out.println("Last method to be executed in Suite");
	}
	
}
