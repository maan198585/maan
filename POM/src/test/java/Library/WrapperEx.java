package Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperEx {
	
	protected WebDriver driver;
	public void launchApplication(String browser, String url) {
		
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				driver =new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\harneet\\Desktop\\Testing\\Drivers\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(url);
				
			}
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.get(url);
			
		} catch (WebDriverException e) {
			System.out.println("browser could not be launched");
			
		}
	}
public void quit() {
	driver.close();
}
}
