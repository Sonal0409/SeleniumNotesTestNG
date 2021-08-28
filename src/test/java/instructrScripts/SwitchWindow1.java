package instructrScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchWindow1 {
	
	@Test
	public void windowhandleDemo()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		driver.findElement(By.id("win2")).click();
		
		// on set object, the values are not stored in basis of indexes
		
	Set<String> handler= driver.getWindowHandles();
	
	//Start an iterator that will point to the set of window handles.
	// this method iterator() will retrun a String Iterator object
	Iterator <String> itr=handler.iterator();
	
	// here itr.next() gives the first set of value
	
	String parentwindow=itr.next();
	System.out.println(parentwindow);
	
	// here itr.next() gives the second set of value
	
	String childwindow=itr.next();
	System.out.println(childwindow);
	
	
	driver.switchTo().window(childwindow);
	
	System.out.println("the title is pop up window is " + driver.getTitle());
	
	driver.close();
	
	driver.switchTo().window(parentwindow);

	System.out.println("the title is parent window is " + driver.getTitle());
	
	//driver.close();
	
	
		
	}

}
