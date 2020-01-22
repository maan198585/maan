package Selenium;

import org.openqa.selenium.WebDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\harneet\\Desktop\\Testing\\Drivers\\IEDriverServer.exe");
		WebDriver driver =new IEDriver();
	}

}
