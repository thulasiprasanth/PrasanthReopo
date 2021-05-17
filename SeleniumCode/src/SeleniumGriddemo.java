

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGriddemo {
	
	@Test
	public void invokeapp() throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		//this is for local system
		//WebDriver driver=new ChromeDriver();
		//driver.get("http://www.google.com");
		//System.out.println(driver.getTitle());
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		//caps.setVersion("89");// it is not mandatory one optional field
		
		//this is for executing your scripts in remote machine
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.70.33:5566/wd/hub"),caps);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("hello selenium grid");
		
		
	}

}
