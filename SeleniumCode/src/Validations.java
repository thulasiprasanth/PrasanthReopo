import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class VerifyGoogle{
	WebDriver driver;
	void launchGoogle(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	void verifyTitle(String expTitle) {
		String actTitle=driver.getTitle();
		if(actTitle.equalsIgnoreCase(expTitle)) {
			System.out.println("title is appearing correct one and actual title is "+actTitle);
		}else {
			System.out.println("title is not appearing correct one and actual title is "+actTitle);;
		}
	}
	
	void verifyURL(String expURL) {
		String actURL=driver.getCurrentUrl();
		if(actURL.equalsIgnoreCase(expURL)) {
			System.out.println("current URL is appearing correct one and actual current URL is "+actURL);
		}else {
			System.out.println("current URL is not appearing correct one and actual current URL is "+actURL);;
		}
	}
	
}

public class Validations {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		VerifyGoogle obj=new VerifyGoogle();
		obj.launchGoogle("http://www.google.com");
		obj.verifyTitle("Google");
		obj.verifyURL("https://www.google.com/?gws_rd=ssl");
	
	}

}
