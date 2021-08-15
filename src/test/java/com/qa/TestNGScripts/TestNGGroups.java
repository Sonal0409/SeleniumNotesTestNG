package com.qa.TestNGScripts;

import org.testng.annotations.Test;

public class TestNGGroups {
	
	@Test(priority='1', groups="createEmail")
	public void ComposeTest()
	{
		System.out.println("Code to test compose");
	}
	@Test(priority='2', groups="createEmail")
	public void Subjetctest()
	{
		System.out.println("Code to test Subject");
	}
	@Test(priority='3', groups="createEmail")
	public void SendButtonTest()
	{
		System.out.println("Code to test send button");
	}
	@Test(priority='4', groups="ModifyEmail")
	public void SearchEmailTest()
	{
		System.out.println("Code to search email");
	}
	@Test(priority='5', groups="ModifyEmail")
	public void OpenEmailtest()
	{
		System.out.println("Code to open exisitng email");
	}
	@Test(priority='6', groups="ModifyEmail")
	public void ModifyEmail()
	{
		System.out.println("Code to Modify an email");
	}
	@Test(priority='1', groups="DeleteEmail")
	public void SearchEmailTest1()
	{
		System.out.println("Code to search email for deletion");
	}
	@Test(priority='2', groups="DeleteEmail")
	public void SelectEmails()
	{
		System.out.println("Code to select multiple emails to delete");
	}
	@Test(priority='3', groups="DeleteEmail")
	public void ThrashEmail()
	{
		System.out.println("Code to thrash multiple email");
	}


}
