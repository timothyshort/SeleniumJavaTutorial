package tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.DashboardPage;
import pages.LoginPage;

public class LoginTestPOM {
	
	WebDriver driver;
	
	
	@Test
	public void loginTestCase() throws InterruptedException {
		
		/* These actions are all on the login page
		 * driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys("tim@testemail.com");
		 * driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("trpass");
		 * driver.findElement(By.id("MainContent_btnLogin")).click();
		*/
		LoginPage.typeUsername(driver, "tim@testemail.com");
		LoginPage.typePassword(driver, "trpass");
		LoginPage.clickLogin(driver);
		
		// These actions are all on the dashboard page
		// String confirmation = driver.findElement(By.id("MainContent_lblid")).getText();
		String confirmation = DashboardPage.confirmation(driver);
		
		// This is an assertion
		assertTrue(confirmation.contains("Welcome back"));
		
	}
	
	@Before
	public void setUp() {
		driver = utilities.DriverFactory.newDriver();
		driver.get("http://sdettraining.com/trguitransactions/Account.aspx");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
