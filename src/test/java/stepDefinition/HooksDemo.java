package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksDemo {
	
	@Before("@first")
	public void firstBeforeScenario() {
		System.out.println("I will run before First scenarios");
	}
	
	@After("@first")
	public void firstAfterScenario() {
		System.out.println("I will run after First scenarios");
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("****************************");
	}
//	************Tagged Hooks****************
	
	@Before("@second")
	public void secondBeforeScenario() {
		System.out.println("I will run before second scenarios");
	}
	
	@After("@second")
	public void secondAfterScenario() {
		System.out.println("I will run after second scenarios");
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("****************************");
		
	}
	
	@Before("@third")
	public void thirdBeforeScenario() {
		System.out.println("I will run before third scenarios");
	}
	
	@After("@third")
	public void thirdAfterScenario() {
		System.out.println("I will run after third scenarios");
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("****************************");
	}

}
