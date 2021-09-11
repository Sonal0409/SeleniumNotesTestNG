package com.qa.keyword.TestMethods;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.qa.keyword.actionMethod.ActionKeyworkMethods;
import com.qa.keyword.utility.ReadExcelDemo;

public class Testcase1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		String Path= "C:\\Users\\sonal\\Desktop\\DataSheet.xlsx";
		
		ReadExcelDemo.readExcel(Path, "Sheet1");
		
		
		for (int i=1; i<=4;i++)
		{
			String kw= ReadExcelDemo.getData(i, 1);
			System.out.println(kw);
			if(kw.equalsIgnoreCase("OpenBrowser"))
			{
				ActionKeyworkMethods.OpenBrowser();
			}
			else if(kw.equalsIgnoreCase("Navigate"))
			{
				ActionKeyworkMethods.Navigate();
			}
			else if(kw.equalsIgnoreCase("SearchInput"))
			{
				ActionKeyworkMethods.SearchInput();
			}
			else if (kw.equalsIgnoreCase("clickbutton"))
			{
				ActionKeyworkMethods.clickbutton();
			}
		}

	}

}
