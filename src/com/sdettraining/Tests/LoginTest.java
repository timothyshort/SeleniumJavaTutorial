package com.sdettraining.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	// String email = "tim@testemail.com";
	// String password = "trpass";
	String[] browsers = {"Firefox","Chrome","Chrome"};
	String[] emails = {"tim@testemail.com","rk@testemail.com","sm@testemail.com"};
	String[] passwords = {"trpass","rkpass","smpass"};
	int records = emails.length;
	
	@Before
	public void setup() {
		System.out.println("This method will run before each @Test");
		// Open a new browser
	}
	@After
	public void tearDown() {
		System.out.println("This method will run after each @Test");
	}
	
	@Test
	public void mySecondTest() {
		System.out.println("Running another test");
	}

	@Test
	public void myLoginTest() throws InterruptedException {
		for (int i=0; i<records; i++) {
			// 1. Instantiate the WebDriver Object
			WebDriver driver = utilities.DriverFactory.newDriver(browsers[i]);
			
			// 2. Open the browser & Navigate to our web application
			// Navigate to URL: http://sdettraining.com/trguitransactions/Account.aspx
			driver.get("http://sdettraining.com/trguitransactions/Account.aspx");
			
			// 3. Find the elements and "do the work"
				// Task 1: Locate the element
				// Task 2: Determine the action
				// Task 3: Pass the parameter
			driver.findElement(By.id("MainContent_txtUserName")).sendKeys(emails[i]); // unique identifies
			driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys(passwords[i]);	// back-end
			
			utilities.Screenshot.snap(driver, "LoginTest-", emails[i] + "-1");
			driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div/div[3]/div[3]/input")).click();
			utilities.Screenshot.snap(driver, "LoginTest-", emails[i] + "-2");
			
			// 4. Get confirmation by capturing text from the web page
			String confirmation = driver.findElement(By.id("MainContent_lblid")).getText();
			String expected = "Welcome back!";
			System.out.println(confirmation);
			
			// 5. Test condition / Assert expectation
			assertEquals(expected, confirmation);
			/*
			if (confirmation.contains("Welcome back to SDET Training")) {
				System.out.println("TEST PASSED");
			}
			else {
				System.out.println("TEST FAILED");
				fail("We did not receive expected confirmation");
			}
			*/
			
			Thread.sleep(1000);
			driver.quit();
		
		}
	}

}
