package StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable_with_Header {
	
	WebDriver driver;

@Given("^Open the Orange hrm url with header pair$")
public void open_the_Orange_hrm_url_with_header_pair() throws Throwable {
	driver=new ChromeDriver();
    driver.get("http://newtours.demoaut.com/");
    
}

@When("^enter the below given credential with header pair$")
public void enter_the_below_given_credential_with_header_pair(DataTable dataTable) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	
	List<Map<String,String> > credential=dataTable.asMaps(String.class, String.class);
    
	String username=credential.get(0).get("Username");
	String password=credential.get(0).get("Password");
	
	driver.findElement(By.name("userName")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
}

@When("^click the submit button$")
public void click_the_submit_button() throws Throwable {
	
	driver.findElement(By.name("login")).click();
  
}

@Then("^Login should be successful with header pair$")
public void login_should_be_successful_with_header_pair() throws Throwable {
driver.findElement(By.linkText("SIGN-OFF")).click();
	System.out.println("logout successful");
	driver.close();
}

}
