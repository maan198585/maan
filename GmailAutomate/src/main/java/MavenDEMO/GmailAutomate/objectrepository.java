package MavenDEMO.GmailAutomate;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		//load is method in file input stream
		obj.load(objfile);
		
		//enter data into form
		driver.findElement(By.id(obj.getProperty("username"))).sendKeys("email");
		driver.findElement(By.id(obj.getProperty("password"))).sendKeys("pass");
		driver.findElement(By.xpath(obj.getProperty("submit"))).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\harneet\\Desktop\\Selenium Softwares\\screenshot2.png"));
	}

}
