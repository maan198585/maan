package MavenDEMO.GmailAutomate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectrepository {
	public static void main(String[] args) throws  IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harneet\\Desktop\\Testing\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		//Load the properties file
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream("C:\\Users\\harneet\\eclipse-workspace\\GmailAutomate\\src\\main\\java\\MavenDEMO\\GmailAutomate\\configure.property");
		obj.load(objfile);
		
		//enter data into form
		driver.findElement(By.id(obj.getProperty("username"))).sendKeys("email");
		driver.findElement(By.id(obj.getProperty("password"))).sendKeys("pass");
		driver.findElement(By.xpath(obj.getProperty("submit"))).click();
		
	}

}
