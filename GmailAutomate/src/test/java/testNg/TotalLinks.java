package testNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.testng.annotations.Test;

public class TotalLinks {

	@Test
	public void checklinks() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harneet\\Desktop\\Testing\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>totallinks=driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		
		

	}

}
