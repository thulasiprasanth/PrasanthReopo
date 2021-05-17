import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.google.com";
		//String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*String title=driver.getTitle();
		System.out.println(title);
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.close();*/
		/*driver.findElement(By.id("openwindow")).click();
		Thread.sleep(2000);
		driver.close();*/
		
		/*String pageinfo=driver.getPageSource();
		System.out.println(pageinfo);*/
		
		
	}

}
