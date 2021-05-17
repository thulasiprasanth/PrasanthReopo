import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//it will switch to frame then only selenium webdriver able to identify elements otherwise it throws NoSuchElemetException
		driver.switchTo().frame(0);
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("hello");
		
		//it will help us back to parent window/other frame inorder to do the action on web elemetns which are in parentwindow or other frame
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("hello1");

	}

}
