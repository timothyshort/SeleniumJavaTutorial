package com.sdettraining.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountManagementTest {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Instantiate the WebDriver Object
		System.setProperty("webdriver.chrome.driver", "C:/Users/owner/Desktop/SDET-June2017/JARs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 2. Open the browser & Navigate to our web application
		// Navigate to URL: http://sdettraining.com/trguitransactions/Account.aspx
		driver.get("http://sdettraining.com/trguitransactions/Account.aspx");
		
		// 3. Find the elements and "do the work"
			// Task 1: Locate the element
			// Task 2: Determine the action
			// Task 3: Pass the parameter
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("tim@testemail.com"); // unique identifies
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("trpass");	// back-end
		driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div/div[3]/div[3]/input")).click();
		
		// 4. Get confirmation by capturing text from the web page
		String confirmation = driver.findElement(By.id("MainContent_lblid")).getText();
		System.out.println(confirmation);
		
		// 5. Test condition / Assert expectation
		if (confirmation.contains("Welcome back")) {
			System.out.println("TEST PASSED");
		}
		else {
			System.out.println("TEST FAILED");
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
