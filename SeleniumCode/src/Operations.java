import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Operations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		//driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//textbox
		driver.findElement(By.id("fname")).sendKeys("Hello selenium");
		
		//button
		driver.findElement(By.id("idOfButton")).click();
		
		//radio button
		driver.findElement(By.id("male")).click();
		
		//checkbox
		driver.findElement(By.className("Automation")).click();
		
		//dropdown
		Select s=new Select(driver.findElement(By.id("testingDropdown")));
		//s.selectByIndex(2);
		//s.selectByVisibleText("Manual Testing");
		
		s.selectByValue("Database");
		
	}

}
