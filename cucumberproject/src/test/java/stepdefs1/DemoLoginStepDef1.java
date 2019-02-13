package stepdefs1;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoLoginStepDef1 {

	WebDriver driver;

	
@Given("^Open the Browser$")
public void open_the_Browser() throws Throwable {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Sunit\\Drivers\\chromedriver.exe");
	  
	  driver = new ChromeDriver(); 
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
}


@Given("^pass the appication url$")
public void pass_the_appication_url() throws Throwable {
	
	driver.get("http://newtours.demoaut.com");

}


@When("^Enter valid userid and password$")
public void enter_valid_userid_and_password() throws Throwable {
	
	Thread.sleep(2000);
	
	WebElement userid = driver.findElement(By.name("userName")); 

	userid.sendKeys("demo");

	WebElement pwd = driver.findElement(By.name("password")); 
	
	pwd.sendKeys("demo");
	
	WebElement login = driver.findElement(By.name("login")); 
	
	login.click();
	
	Thread.sleep(3000);
}


@Then("^Signout options should by visible on second page\\.$")
public void signout_options_should_by_visible_on_second_page() throws Throwable {

	driver.close();
	
}
	
	
}
