package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Parameterization {

	WebDriver driver;

@Given("^Open the url$")
public void open_the_url() throws Throwable {
    driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("^enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
public void enter_username_as_and_password_as(String username, String password) throws Throwable {
	
   driver.findElement(By.id("txtUsername")).sendKeys(username);
   driver.findElement(By.id("txtPassword")).sendKeys(password);
}

@When("^click submit$")
public void click_submit() throws Throwable {
	driver.findElement(By.id("btnLogin")).click();
    
}

@Then("^Login should be successfull$")
public void login_should_be_successfull() throws Throwable {
	
	boolean status=driver.findElement(By.linkText("Admin")).isDisplayed();
	
		System.out.println("login successful");
		driver.close();
	
   
}
	
}
