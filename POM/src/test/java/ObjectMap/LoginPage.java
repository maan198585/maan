package ObjectMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By username= By.name("email");
	By Password=By.id("pass");
	By loginbutton=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input");
			public  LoginPage(WebDriver driver)
			{
		this.driver=driver;
			}
			public void loginToApp_username(String userid)
			{
				driver.findElement(username).sendKeys(userid);
			}
			public void loginToApp_password(String pass)
			{
				driver.findElement(Password).sendKeys(pass);	
			}
			public void loginToApp_loginbutton()
			{
				driver.findElement(loginbutton).click();	
		}
			}


