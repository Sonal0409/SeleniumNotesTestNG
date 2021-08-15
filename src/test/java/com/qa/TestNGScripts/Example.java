package com.qa.TestNGScripts;

import org.testng.annotations.Test;

public class Example {

	@Test(priority='1', dependsOnMethods="MethodB")
	public void MethodA()
	{
		System.out.println("this method A");
	}
	@Test(priority='2')
	public void MethodB()
	{
		System.out.println("this method B");
	}
}
