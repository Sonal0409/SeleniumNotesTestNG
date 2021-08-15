package com.qa.TestNGScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo1 {
	
	
	@Parameters({"parm1","param2","param3"})
	@Test
	public void method(String parm1, String Param2, String Param3)
	{
	  System.out.println(parm1);
	 System.out.println(Param2);
	 System.out.println(Param3);
	}

}
