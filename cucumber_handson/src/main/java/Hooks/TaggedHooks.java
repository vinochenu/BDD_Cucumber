package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooks {
	
	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("After Scenario");
		
	}
	
	@Before("@1stScenario")
	public void before1stScenario() {
		System.out.println("Before 1st Scenario");
	}
	@Before("@2ndScenario")
	public void before2ndScenario() {
		System.out.println("Before 2nd Scenario");
	}
	@Before("@3rdScenario")
	public void before3rdScenario() {
		System.out.println("Before 3rd Scenario");
	}
	
	@After("@1stScenario")
	public void after1stScenario() {
		System.out.println("After 1st Scenario");
	}
	@After("@2ndScenario")
	public void after2ndScenario() {
		System.out.println("After 2nd Scenario");
	}
	@After("@3rdScenario")
	public void after3rdScenario() {
		System.out.println("After 3rd Scenario");
	}
	

}
