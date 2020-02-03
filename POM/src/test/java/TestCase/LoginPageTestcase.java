package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import ObjectMap.LoginPage;

public class LoginPageTestcase extends WrapperEx {
	
	@BeforeClass
	public void startup() {
		
		launchApplication("chrome","https://www.facebook.com/");
	}
@Test
public void login()
{
	LoginPage lpage=new LoginPage(driver);
	lpage.loginToApp_username("Karamjit");
	lpage.loginToApp_password("Karamjit123");
	lpage.loginToApp_loginbutton();
}
@AfterClass
public void close() {
	quit();
	
}
}
