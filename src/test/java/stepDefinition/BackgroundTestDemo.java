package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundTestDemo {
	@Given("precondition one")
	public void precondition_one() {
	    System.out.println("Background Pre-Condition One");
	}

	@When("precondition two")
	public void precondition_two() {
		System.out.println("Background Pre-Condition Two");
	}

	@Given("step one")
	public void step_one() {
	    System.out.println("Step One");
	}

	@When("step two")
	public void step_two() {
	    System.out.println("Step Two");
	}

	@Then("step three")
	public void step_three() {
	    System.out.println("Step Three");
	}
}
