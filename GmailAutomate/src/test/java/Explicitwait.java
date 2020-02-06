import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harneet\\Desktop\\Testing\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		driver.findElement(By.id("email")).sendKeys("maan.karamjitsingh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("maan123");
		WebDriverWait wait =new WebDriverWait(driver ,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_b")));
		
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(3000);
		

	}

}
