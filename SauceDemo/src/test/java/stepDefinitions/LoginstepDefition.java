package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginstepDefition {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	LoginPage loginPage;
	
	public LoginstepDefition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.loginPage =testContextSetup.pageObjectManager.getLoginPage();
	}
	@Given("User is on Login Page of Sauce demo.")
	public void user_is_on_login_page_of_sauce_demo() throws InterruptedException {
		Assert.assertTrue(loginPage.getTitleLoginPage().contains("Swag Labs"));
		Thread.sleep(2000);
	}
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String name, String password) throws InterruptedException {
		loginPage.enterUsername(name);
		loginPage.enterPassword(password);
		Thread.sleep(2000);
	}
	
	@When("User enters invalid {string} and valid {string}")
	public void user_enters_invalid_and_valid(String name, String password) throws InterruptedException {
		loginPage.enterUsername(name);
		loginPage.enterPassword(password);
		Thread.sleep(2000);
	}
	
	@When("User enters valid {string} and invalid {string}")
	public void user_enters_valid_and_invalid(String name, String password) throws InterruptedException {
		loginPage.enterUsername(name);
		loginPage.enterPassword(password);
		Thread.sleep(2000);
	}
	
	@When("User enters invalid {string} and invalid {string}")
	public void user_enters_invalid_and_invalid(String name, String password) throws InterruptedException {
		loginPage.enterUsername(name);
		loginPage.enterPassword(password);
		Thread.sleep(2000);
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginPage.clickLoginBtn();
		Thread.sleep(2000);
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		loginPage.verifyHomePage();
		Thread.sleep(2000);
	}
	
	@Then("User shows pop up msg")
	public void user_shows_pop_up_msg() throws InterruptedException {
		loginPage.popMsg();
		Thread.sleep(2000);
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    loginPage.closeBrowser();
	}

}
