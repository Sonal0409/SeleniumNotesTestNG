package com.qa.TestNGScripts;

import org.testng.annotations.Test;

public class Anootations4 {
	
	@Test(priority='1')
	public void login()
	{
		System.out.println("loginto application");
	
	}
@Test(priority='2')
	public void createEmail()
	{
		System.out.println("Create email code");
	}
	@Test(priority='3', enabled=false)
	public void Registration()
	{
		System.out.println("Registration of user  code");
	}
	
}
