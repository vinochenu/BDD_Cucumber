package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable_Examples {
	
	WebDriver driver;
@Given("^user enter Mercury URL$")
public void user_enter_Mercury_URL() throws Throwable {
	driver=new ChromeDriver();
    driver.get("http://newtours.demoaut.com/");
    
}

@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String username, String password) throws Throwable {
	
	driver.findElement(By.name("userName")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("login")).click();
    
}

@Then("^user click login button with example credential$")
public void user_click_login_button_with_example_credential() throws Throwable {
	driver.findElement(By.linkText("SIGN-OFF")).click();
	System.out.println("logout successful");
	driver.close();
    
}

}
