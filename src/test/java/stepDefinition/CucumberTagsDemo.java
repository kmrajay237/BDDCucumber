package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTagsDemo {
//	***************************************************
//	********************** Smoke Tags *****************
//	***************************************************
	@Given("Step One for Smoke")
	public void step_one_for_smoke() {
	   System.out.println("Step One for Smoke");
	}

	@When("Step Two for Smoke")
	public void step_two_for_smoke() {
		System.out.println("Step Two for Smoke");
	}

	@Then("Step three for Smoke")
	public void step_three_for_smoke() {
		System.out.println("Step Three for Smoke");
	}

	@Then("Step Four for Smoke")
	public void step_four_for_smoke() {
		System.out.println("Step Four for Smoke");
	}

	@Then("Step Five for Smoke")
	public void step_five_for_smoke() {
		System.out.println("Step Five for Smoke");
	}
//	***************************************************
//	********************** Regression Tags *****************
//	***************************************************
	@Given("Step One for Regression")
	public void step_one_for_regression() {
		System.out.println("Step One for Regression");
	}

	@When("Step Two for Regression")
	public void step_two_for_regression() {
		System.out.println("Step Two for Regression");
	}

	@Then("Step three for Regression")
	public void step_three_for_regression() {
		System.out.println("Step Three for Regression");
	}

	@Then("Step Four for Regression")
	public void step_four_for_regression() {
		System.out.println("Step Four for Regression");
	}

	@Then("Step Five for Regression")
	public void step_five_for_regression() {
		System.out.println("Step Five for Regression");
	}
//	***************************************************
//	********************** Functional Tags *****************
//	***************************************************
	@Given("Step One for Functional")
	public void step_one_for_functional() {
		System.out.println("Step One for Functional");
	}

	@When("Step Two for Functional")
	public void step_two_for_functional() {
		System.out.println("Step Two for Functional");
	}

	@Then("Step three for Functional")
	public void step_three_for_functional() {
		System.out.println("Step Three for Functional");
	}

	@Then("Step Four for Functional")
	public void step_four_for_functional() {
		System.out.println("Step Four for Functional");
	}

	@Then("Step Five for Functional")
	public void step_five_for_functional() {
		System.out.println("Step Five for Functional");
	}
//	***************************************************
//	********************** Non-Functional Tags *****************
//	***************************************************
	@Given("Step One for Non-Functional")
	public void step_one_for_non_functional() {
		System.out.println("Step One for Non-Functional");
	}

	@When("Step Two Non-Functional")
	public void step_two_non_functional() {
		System.out.println("Step Two for Non-Functional");
	}

	@Then("Step three Non-Functional")
	public void step_three_non_functional() {
		System.out.println("Step Three for Non-Functional");
	}

	@Then("Step Four Non-Functional")
	public void step_four_non_functional() {
		System.out.println("Step Four for Non-Functional");
	}

	@Then("Step Five Non-Functional")
	public void step_five_non_functional() {
		System.out.println("Step Five for Non-Functional");
	}
}
