package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	// This method takes a screenshot of the browser and saves as a file
	public static void snap(WebDriver driver, String filename, String suffix) {
		File ScrnshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Create file from the screenshot of driver
		try {
			FileUtils.copyFile(ScrnshotFile, new File ("C:/Users/owner/Desktop/SDET-June2017/TestOutput/" + filename + suffix + ".jpg"));
		} catch (IOException e) {
			System.out.println("Could not save the file");
			e.printStackTrace();
		}
	}
	
}
