package step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststep {
	WebDriver driver;
    @Given("^I launch Chrome browser$")
    public void launch_browser() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harneet\\Desktop\\Testing\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
    }
    @When("^I open Google Homepage$")
    public void open_Homepage() throws InterruptedException 
    	{
    		Thread.sleep(5000);
    		driver.get("https://www.google.co.in");
    	}
    	@Then("^I verify that text is entered and searched$")
    	 public void verify_textbox()
    	 {
    		WebElement txtbox=driver.findElement(By.name("q"));
    		if (txtbox.isEnabled())
    		{
    			txtbox.sendKeys("Hello Welcome");
    			//driver.close();
    		}
    	 }
    	@And("^I verify that the page displays search text box$")
    	public void display_searchbutton()
    	{
    		System.out.println("The page displays Google search button");
    		
    			
    		}
    	 
    	
    }


