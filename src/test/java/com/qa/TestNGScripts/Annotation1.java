package com.qa.TestNGScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
	
	
	@BeforeTest
	public void method1()
	{
		System.out.println("method to be executed before thetest begins");
	}
	
	@BeforeMethod  // this particular method will be executed before every test method
	public void login()
	{
		System.out.println("Loginto the application");
	}
	
	
	@Test(priority='1')
	public void CreateEmail()
	{
		System.out.println("this is code to cretae an email");
	}
	
	@Test(priority='2')
	public void SearchMethod()
	{
		System.out.println("Search for an email");
	}
	
    @Test(priority='3', dependsOnMethods="SearchMethod")
	public void ModifyEmail()
	{
		System.out.println("this is code to modify an email");
	}
	
    @Test(priority='4', dependsOnMethods="SearchMethod")
	public void DeleteEmail()
	{
		System.out.println("this is code to delete an email");
	}

    @AfterMethod
    public void closeBrowser()
    {
    	System.out.println("logout");
    }
    
	@AfterTest
	public void methodx()
	{
		System.out.println("method to be executed after thetest ends");
	}
}
