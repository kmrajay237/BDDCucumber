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

public class SwagLabsLoginValidCredential {
	
	public WebDriver driver;
	public SoftAssert soft=new SoftAssert();
	
	@Given("Launch the application with valid URL.")
	public void launch_the_application_with_valid_url() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.saucedemo.com/");
	}

//	@When("Provide valid user name in username text box.")
//	public void provide_valid_user_name_in_username_text_box() {
//		WebElement username = driver.findElement(By.id("user-name"));
//		username.sendKeys("standard_user");
//	}
	
	@When("Provide valid {string} in username text box.")
	public void provide_valid_in_username_text_box(String string) {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(string);
	}

//	@When("Provide valid password in password textbox.")
//	public void provide_valid_password_in_password_textbox() {
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("secret_sauce");
//	}

	@When("Provide valid {string} in password textbox.")
	public void provide_valid_in_password_textbox(String string) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(string);
	}
	@When("Click on Login button.")
	public void click_on_login_button() {
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

	@Then("User should be able to login into the application successfully.")
	public void user_should_be_able_to_login_into_the_application_successfully() {
	   String expURL="https://www.saucedemo.com/inventory.html";
	   String actURL=driver.getCurrentUrl();
	   soft.assertEquals(actURL, expURL);
	}

	@Then("Products Page should be displayed.")
	public void products_page_should_be_displayed() {
	    WebElement products = driver.findElement(By.cssSelector(".product_label"));
	    soft.assertEquals(products.isDisplayed(), true);
	}

	@Then("Close the browser.")
	public void close_the_browser() {
	    driver.close();
	}
}
