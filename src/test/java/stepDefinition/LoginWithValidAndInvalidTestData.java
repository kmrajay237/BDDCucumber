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

public class LoginWithValidAndInvalidTestData {
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();

	@Given("Browser is launched and application is open.")
	public void browser_is_launched_and_application_is_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
	}

	@When("Provide {string} and {string}.")
	public void provide_and(String username, String password) {
		WebElement user = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
		user.sendKeys(username);
		pass.sendKeys(password);
	}

	@Then("click on Login button.")
	public void click_on_login_button() throws InterruptedException {
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		Thread.sleep(2000);
	}

	@Then("Verify the Error or Success.")
	public void verify_the_error_or_success() {

//		if (driver.findElement(By.cssSelector(".product_label")).isDisplayed())
//			softassert.assertEquals(driver.findElement(By.cssSelector(".product_label")).isDisplayed(), true);
//		if (driver.findElement(By.cssSelector(".error-button")).isDisplayed())
//			softassert.assertEquals(driver.findElement(By.cssSelector(".error-button")).isDisplayed(), true);
//		else
//			System.out.println("Something went wrong");
	}

	@Then("close the application.")
	public void close_the_application() {
		driver.close();
		// softassert.assertAll();
	}
}
