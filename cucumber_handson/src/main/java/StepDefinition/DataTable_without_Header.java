package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable_without_Header {
	
WebDriver driver;

@Given("^Open the Orange hrm url$")
public void open_the_Orange_hrm_url() throws Throwable {
	driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    
}

@When("^enter the below given credential$")
public void enter_the_below_given_credential(DataTable datatable) throws Throwable {
	
	List<String> credential=datatable.asList(String.class);
	String username=credential.get(0);
	String password=credential.get(1);
	
	  driver.findElement(By.id("txtUsername")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
  
}

@When("^click submit button$")
public void click_submit_button() throws Throwable {
	driver.findElement(By.id("btnLogin")).click();
    
}

@Then("^Login should be successfull via DataTable with no header$")
public void login_should_be_successfull_via_DataTable_with_no_header() throws Throwable {
	boolean status=driver.findElement(By.linkText("Admin")).isDisplayed();
	
	System.out.println("login successful");
	driver.close();
}

}
