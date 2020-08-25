package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BroswerOpen {
	
WebDriver driver;
@Given("^Enter URL$")
public void enter_URL() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver =new ChromeDriver();
	   driver.get("https://www.google.co.in/?gws_rd=ssl");
}

@When("^User input \"([^\"]*)\"$")
public void user_input(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("q")).sendKeys(arg1);
  
}

@Then("^result should display$")
public void result_should_display() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Boolean status=driver.findElement(By.partialLinkText("selenium")).isDisplayed();
	if(status.TRUE) {
		System.out.println("Test passed");
	}
	
	driver.close();
   
}

}
