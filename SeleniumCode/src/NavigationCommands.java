import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		//Navigate To
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//forward and back
		/*System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());*/
		
		//refresh
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.navigate().refresh();
		
	}

}
