package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabsLaunchAppValidURL {
	
	public WebDriver driver;
	public SoftAssert soft=new SoftAssert();
	
	@Given("I want to launch chrome Brower.")
	public void i_want_to_launch_chrome_brower() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("I use valid URL of the Application in browser address bar.")
	public void i_use_valid_url_of_the_application_in_browser_address_bar() {
	    driver.get("https://www.saucedemo.com/");
	}

	@Then("User should be able to launch the application and login page should be displayed.")
	public void user_should_be_able_to_launch_the_application_and_login_page_should_be_displayed() {
	    WebElement username = driver.findElement(By.id("user-name"));
	    WebElement password = driver.findElement(By.id("password"));
	    WebElement loginButton = driver.findElement(By.id("login-button"));
	    soft.assertEquals(username.isDisplayed(), true);
	    soft.assertEquals(password.isDisplayed(), true);
	    soft.assertEquals(loginButton.isDisplayed(), true);
	}
	
	@Then("User closes the browser and application")
	public void user_closes_the_browser_and_application() {
	    driver.quit();
	    soft.assertAll();
	}

}
