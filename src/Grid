package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities().firefox();
		// we are providing 2 cappabilties to the server using object cap
		
	
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options = new ChromeOptions();
		
		 options.merge(cap); 
		 
			
		String huburl="http://192.168.1.14:4545/wd/hub";
		
		//WebDriver driver= new RemoteWebDriver(new URL(huburl), options);
		
		WebDriver driver= new RemoteWebDriver(new URL(huburl), cap);
		
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
