package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenDemo {
	
	@Given("This is first step {string}.")
	public void this_is_first_step(String empid) {
	    System.out.print(empid+" ");
	}

	@When("This is second step {string}.")
	public void this_is_second_step(String name) {
	    System.out.print(name+" ");
	}

	@Then("This is third step {string}.")
	public void this_is_third_step(String dept) {
	    System.out.print(dept+" ");
	}

	@Then("This is fourth step {string}.")
	public void this_is_fourth_step(String semester) {
	    System.out.print(semester);
	    System.out.println();
	}

}
