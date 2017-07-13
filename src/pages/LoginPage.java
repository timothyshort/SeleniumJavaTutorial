package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	// Goal: create a repository of page elements for each page
	// Step 1 - Create a class for each page
	// Step 2 - Create a method for each element
	
	
	// driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys("tim@testemail.com");
	public static void typeUsername(WebDriver driver, String email) {
		driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys(email);
	}
	
	// driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("trpass");
	public static void typePassword(WebDriver driver, String password) {
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys(password);
	}
	
	// driver.findElement(By.id("MainContent_btnLogin")).click();
	public static void clickLogin(WebDriver driver) {
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}

}
