package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagefactory.LoginPage;

public class LoginTestPageFactory {
	WebDriver driver;
	LoginPage LoginPage;
	String webUrl = "http://sdettraining.com/trguitransactions/Account.aspx";
	
	@Test
	public void LoginTestCase() {
		LoginPage.doLogin("tim@testemail.com", "trpass");
		// Assertion here
	}
	
	@BeforeMethod
	public void setUp() {
		driver = utilities.DriverFactory.newDriver();
		driver.get(webUrl);
		LoginPage = new LoginPage(driver);
	}
	

}
