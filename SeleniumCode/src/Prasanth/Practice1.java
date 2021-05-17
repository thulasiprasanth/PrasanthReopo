package Prasanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(10000);
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("tmprasanth");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("tmprasanth");
		driver.quit();
		driver.close();
		
		
		
		
		

	}

}
