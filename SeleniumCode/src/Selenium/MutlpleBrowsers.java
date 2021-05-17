package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MutlpleBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome driver
		/*System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//firefox driver
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.com");*/
		
		//ie driver
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Prasad\\Downloads\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
		WebDriver driver2=new InternetExplorerDriver();
		driver2.get("https://www.google.com");
		
	}

}
