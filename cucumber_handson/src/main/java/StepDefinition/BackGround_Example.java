package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackGround_Example {

@Given("^person should know how to cook$")
public void person_should_know_how_to_cook() throws Throwable {
	System.out.println("person should know how to cook");
   
}

@Given("^should have batter$")
public void should_have_batter() throws Throwable {
    System.out.println("should have batter");
}

@When("^Switch on stove$")
public void switch_on_stove() throws Throwable {
    System.out.println("Switch on stove");
}

@Then("^prepare Dosa$")
public void prepare_Dosa() throws Throwable {
    System.out.println("prepare Dosa");
}

@Then("^have Breakfast$")
public void have_Breakfast() throws Throwable {
    System.out.println("have Breakfast");
    
}



@Given("^should have rice$")
public void should_have_rice() throws Throwable {
    System.out.println("should have rice");
}

@When("^power on stove$")
public void power_on_stove() throws Throwable {
    System.out.println("power on stove");
}

@Then("^prepare veg rice$")
public void prepare_veg_rice() throws Throwable {
  System.out.println("prepare veg rice");
}

@Then("^have lunch$")
public void have_lunch() throws Throwable {
System.out.println("have lunch");
}



}
