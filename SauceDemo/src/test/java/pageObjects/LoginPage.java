package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By userNameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginBtn = By.id("login-button");
	By menuHomePage = By.id("menu_button_container");
	By errorMsg = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");
	
	public String getTitleLoginPage()
	{
		return driver.getTitle();
	}
	
	public void enterUsername(String name)
	{
		driver.findElement(userNameField).sendKeys(name);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(loginBtn).click();
	}
	
	public void verifyHomePage()
	{
		boolean homePage = driver.findElement(menuHomePage).isDisplayed();
		System.out.println(homePage);
	}
	
	public void popMsg()
	{
		String msg = driver.findElement(errorMsg).getText();
	    System.out.println(msg);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	

	
	
}
