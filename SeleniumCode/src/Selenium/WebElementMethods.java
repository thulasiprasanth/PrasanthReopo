package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.testandquiz.com/selenium/testing.html");
		//driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//clear method
		//isDisplayed
		/*boolean b=driver.findElement(By.id("fname")).isDisplayed();
		if(b) {
			driver.findElement(By.id("fname")).sendKeys("Hello");
		}*/
		
		//isEnabled
		/*boolean b1=driver.findElement(By.id("fname")).isEnabled();
		if(b1) {
			System.out.println(b1);
			driver.findElement(By.id("fname")).sendKeys("Hello");
		}*/
		
		//Thread.sleep(2000);
		//driver.findElement(By.id("fname")).clear();
		
		
		//isSelected
		/*Select s=new Select(driver.findElement(By.id("testingDropdown")));
		s.selectByVisibleText("Manual Testing");
		boolean b2=driver.findElement(By.id("testingDropdown")).isSelected();
		Thread.sleep(2000);
		System.out.println(b2);*/
		
		//gettext
		/*String text=driver.findElement(By.id("idOfButton")).getText();
		System.out.println(text);
		
		//getAttribue
		String text1=driver.findElement(By.id("idOfButton")).getAttribute("title");
		System.out.println(text1);*/
		/*driver.findElement(By.id("fname")).sendKeys("Hello");
		
		String text=driver.findElement(By.id("fname")).getAttribute("value");
		System.out.println(text);*/
		
		//isSelected-radio button
		/*boolean b1=driver.findElement(By.id("male")).isSelected();
		System.out.println(b1);
		driver.findElement(By.id("male")).click();
		boolean b=driver.findElement(By.id("male")).isSelected();
		System.out.println(b);*/
		
		//isSelected-checkbox
		/*boolean b1=driver.findElement(By.className("Automation")).isSelected();
		System.out.println(b1);
		driver.findElement(By.className("Automation")).click();
		boolean b=driver.findElement(By.className("Automation")).isSelected();
		System.out.println(b);*/
		
		//isSelected-dropdown
		/*Select s=new Select(driver.findElement(By.id("testingDropdown")));
		s.selectByVisibleText("Manual Testing");
		//boolean b3=s.getFirstSelectedOption().isSelected();
		
		//using gettext()
		String s1=s.getFirstSelectedOption().getText();
		System.out.println(s1);
		if(s1.equalsIgnoreCase("Manual Testing")) {
			System.out.println("item got selected successfully");
		}else {
			System.out.println("item not selected");
		}*/
		
		
	
		
		
		
		
	}

}
