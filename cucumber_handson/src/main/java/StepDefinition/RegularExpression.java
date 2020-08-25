package StepDefinition;

import cucumber.api.java.en.Given;

public class RegularExpression {
	
	
	
	@Given("^my name is \"(.*?)\"$")
	public void my_name_is_vinothkumar(String name) {
		System.out.println("my name is "+name);
	}
	
	@Given("^my age is (\\d+)$")
	public void my_age_30(int age) {
		System.out.println("my age is "+age);

}
	@Given("^my salary is (\\d+\\.\\d+)$")
	public void my_salary_is(float salary) throws Throwable {
		System.out.println("my salary is "+salary);
	
	/*@Given("^my salary is (\\d+\\.\\d+)$")
	public void my_salary_is_7.5(float salary) {
		System.out.println("my salary is "+salary);
}*/
}
}