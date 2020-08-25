package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Before_After_Hooks {
	@Before(order=0)
	public void before1() {
		System.out.println("Day started");
	}
	
	@Before(order=1)
	public void before2() {
		System.out.println("Test has been started");
	}
	@After(order=1)
	public void after1() {
	System.out.println("Test case has been ended");	
	}
	
	@After(order=0)
	public void after2() {
	System.out.println("Day ended");	
	}

}
