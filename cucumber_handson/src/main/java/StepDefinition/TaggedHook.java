package StepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHook {

@Given("^(\\d+)st scenario-first step$")
public void st_scenario_first_step(int arg1) throws Throwable {
	System.out.println("1st_scenario_first_step");
   
}

@When("^(\\d+)st scenario-second step$")
public void st_scenario_second_step(int arg1) throws Throwable {
	System.out.println("1st_scenario_second_step");
}

@Then("^(\\d+)st scenario-third step$")
public void st_scenario_third_step(int arg1) throws Throwable {
	System.out.println("1st_scenario_third_step"); 
}

@Given("^(\\d+)nd Scenario-first step$")
public void nd_Scenario_first_step(int arg1) throws Throwable {
	System.out.println("2nd_scenario_first_step");
}

@When("^(\\d+)nd Scenario-second step$")
public void nd_Scenario_second_step(int arg1) throws Throwable {
	System.out.println("2nd_scenario_second_step");
}

@Then("^(\\d+)nd Scenario-third step$")
public void nd_Scenario_third_step(int arg1) throws Throwable {
	System.out.println("2nd_scenario_third_step");
}

@Given("^(\\d+)rd Scenario-first step$")
public void rd_Scenario_first_step(int arg1) throws Throwable {
	System.out.println("3rd_scenario_first_step");
}

@When("^(\\d+)rd Scenario-second step$")
public void rd_Scenario_second_step(int arg1) throws Throwable {
	System.out.println("3rd_scenario_second_step");
}

@Then("^(\\d+)rd Scenario-third step$")
public void rd_Scenario_third_step(int arg1) throws Throwable {
	System.out.println("3rd_scenario_third_step");
}



}
