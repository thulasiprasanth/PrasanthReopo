import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handlinglinksdropdowns {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//String url="http://demo.guru99.com/test/newtours/index.php";
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//handling links
		/*List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		/*for(int i=0;i<list.size();i++) {
			String linktxt=list.get(i).getText();
			System.out.println(linktxt);
		}
		
		for(WebElement txt:list) {
			System.out.println(txt.getText());
		}*/
		
		//handling checkboxs
		/*List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		/*for(int i=0;i<list.size();i++) {
			list.get(i).click();
		}
		for(WebElement txt:list) {
			txt.click();
		}*/
		
		//handlig drop down
		/*Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		List<WebElement> items=s.getOptions();
		for(WebElement elm:items) {
			System.out.println(elm.getText());
			elm.click();
		}*/
		
		//without using select class
		List<WebElement> items=driver.findElements(By.tagName("option"));
		for(WebElement elm:items) {
			System.out.println(elm.getText());
			elm.click();
		}
		
		
	}
}
