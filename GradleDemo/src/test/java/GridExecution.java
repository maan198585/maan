import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GridExecution {

	WebDriver driver;
	String baseurl,nodeurl;
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		baseurl="http://facebook.com";
		nodeurl="http://192.168.0.101:5566/wd/hub";
		DesiredCapabilities Capability= DesiredCapabilities.chrome();
		Capability.setBrowserName("chrome");
		Capability.setPlatform(Platform.WINDOWS);
		driver =new RemoteWebDriver(new URL(nodeurl),Capability);
	}
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
   @Test
public void simpleTest() {
	driver.get(baseurl);
	String a=driver.getTitle();
	System.out.println("the title of page is: "+ a);
}
	}


