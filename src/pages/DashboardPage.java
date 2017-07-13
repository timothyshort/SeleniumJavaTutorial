package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	// This method will return a String of the MainContent_lblid element
	public static String confirmation(WebDriver driver) {
		return driver.findElement(By.id("MainContent_lblid")).getText();
	}

}
