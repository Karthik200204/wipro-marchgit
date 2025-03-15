package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TesterRE {
	@Given("I am a {string} Tester")
	public void i_am_a_tester(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am a " + string + " Tester");
	}

	@Then("I got a {string} paid job")
	public void i_got_a_paid_job(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I got a " + string + " paid job");
	}

	@Then("I am {string} satisfied with my salary")
	public void i_am_satisfied_with_my_salary(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am  " + string + " satisfied with my salary");
	}

}
