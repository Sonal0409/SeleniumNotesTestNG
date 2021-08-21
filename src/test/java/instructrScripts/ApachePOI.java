package instructrScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.Xls_Reader;
import com.Utility.Xls_dataProvider;


public class ApachePOI {
	
	public static WebDriver driver;
	
	Xls_Reader reader = new Xls_Reader("C:\\Users\\vishal mittal\\Desktop\\testdata.xlsx");
	@BeforeClass
public static void setup()
{
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (22)\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();  // maximize the browser window
driver.manage().deleteAllCookies();  // delete cookies on the browser
driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium		+%28software%29");
}	
	@Test(priority='1')
	public void CreateStstusCol()
	{
		
		reader.addColumn("Sheet1", "Status");
	}
	@Test(priority='2',dataProvider="testdata")
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
	//@Test
	public void WriteExcel()
	{
		Xls_Reader reader = new Xls_Reader("C:\\Users\\vishal mittal\\Desktop\\testdata.xlsx");
		
	//	reader.addSheet("newdata");
		
		if(reader.isSheetExist("newdata"))
		{
			reader.addColumn("newdata", "Text1");
			reader.addColumn("newdata", "Text2");
		}
		
		
		String var1= driver.findElement(By.linkText("Main page")).getText();
		reader.setCellData("newdata", "Text1", 2, var1);
		
		String var2= driver.findElement(By.linkText("Current events")).getText();
		System.out.println(var2);
		reader.setCellData("newdata", "Text1", 3, var2);
		
		String var3= driver.findElement(By.linkText("Contact us")).getText();
		System.out.println(var3);
		reader.setCellData("newdata", "Text1", 4, var3);
		


	}
	 
}
