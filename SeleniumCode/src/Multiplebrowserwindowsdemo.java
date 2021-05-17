import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplebrowserwindowsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//parent window
		String parentwnd=driver.getWindowHandle();
		System.out.println("parent window "+parentwnd);
		driver.findElement(By.id("openwindow")).click();
		
		//it holds all windows opened by webdriver
		Set<String> wnds=driver.getWindowHandles();
		System.out.println("windows "+wnds);
		for(String s:wnds) {
			if(!s.equalsIgnoreCase(parentwnd)) {
				System.out.println("child window "+s);
				//to swtich child window
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
				//to maximize the child window
				driver.switchTo().window(s).manage().window().maximize();
				driver.findElement(By.xpath("//span[text()='Login']")).click();
				driver.findElement(By.id("user_email")).sendKeys("prasadneeli06@gmail.com");
				Thread.sleep(2000);
				driver.close();
			}
		}
		//to swich back to parent window inorder to do the some action on weblements
		driver.switchTo().window(parentwnd);
		driver.findElement(By.id("name")).sendKeys("Hello");
		
	}
}
