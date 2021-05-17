import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//id locator
		//driver.findElement(By.id("fname")).sendKeys("Hello Selenium");
		
		//name locator
		//driver.findElement(By.name("firstName")).sendKeys("Hello Selenium");
		
		//By tag name
		//driver.findElement(By.tagName("input")).sendKeys("hello selenium");
		
		//linktext
		//driver.findElement(By.linkText("This is a link")).click();
		
		//partial link text
		//driver.findElement(By.partialLinkText("This is")).click();
		
		//xpath-single attribute
		//driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("hello selenium");
		
		//xpath-multiattribute
		//driver.findElement(By.xpath("//input[@id='fname'][@name='firstName']")).sendKeys("hello selenium");
		
		//xpath-AND
		//driver.findElement(By.xpath("//input[@id='fname' and @name='firstName']")).sendKeys("hello selenium");
		
		//xpath-OR
		//driver.findElement(By.xpath("//input[@id='fname1' or @name='firstName']")).sendKeys("hello selenium");
		
		//xpath-start-with
		//driver.findElement(By.xpath("//input[starts-with(@name,'first')]")).sendKeys("hello selenium");
		
		//xpath-text()
		//driver.findElement(By.xpath("//*[text()='Submit']")).click();
		
		//xpath-contains
		//driver.findElement(By.xpath("//*[contains(@title,'Click')]")).click();
		
		//xpath-last() //it will able to identify the webelement uniquely based on attribute properties and consider last one based on last() method
		driver.findElement(By.xpath("(//input[@size='10'])[last()]")).sendKeys("mercury");
		
		
		
	}

}
