package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class LoginGmail {

	@BeforeMethod
	private void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harneet\\Desktop\\Testing\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.gmail.com/");
	}
	
}

	


