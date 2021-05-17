import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocatordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		//CSS-ID 
		//driver.findElement(By.cssSelector("input#fname")).sendKeys("Hello");
		
		//CSS-classname
		//driver.findElement(By.cssSelector("input.Automation")).click();
		
		//CSS-Attribute
		//driver.findElement(By.cssSelector("input[value='male']")).click();
		
		//CSS-sub string -it will consider always prefix of substring
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("Hello");
		
		

	}

}
