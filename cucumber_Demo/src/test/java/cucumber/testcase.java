package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase {
	WebDriver driver;
	@Test
	public void launch_browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harneet\\Desktop\\Testing\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement txtbox=driver.findElement(By.name("q"));
		if(txtbox.isEnabled())
		{
			txtbox.sendKeys("Hello Welcome");
			System.out.println("the page displays google search button");
			driver.close();
		}
	}

}
