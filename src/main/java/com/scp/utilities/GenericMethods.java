package com.scp.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.scp.selenium.constants.AppConstants;

/**
 * 
 * @author Yogesh
 *
 */
public class GenericMethods {
	public static WebDriver driver = null;
	/**
	 *  Purpose of this method is to inilize driver
	 *  based on user choice
	 * @param browser
	 * @return
	 */
	public static WebDriver initilizeWebDriver(AppConstants.BrowserTypes browser) {
		WebDriver driver = null;
		switch (browser) {
		case Firefox:
			driver = new FirefoxDriver();
			break;
		case Chrome:
			System.setProperty("", "");
			driver = new ChromeDriver();
			break;
		case IE:
			System.setProperty("", "");
			driver = new InternetExplorerDriver();
			break;
		case Safari:
			System.setProperty("", "");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("vyvstit tak re...");
		}

		driver.manage().window().maximize();
		driver.get(AppConstants.APPLICATION_URL);
		return driver;

	}
	
	public static void scrollPage(AppConstants.scollDirection direction){
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		if(AppConstants.scollDirection.DOWN.equals(direction))
			executor.executeScript("scroll(0, 250);");
		else
			executor.executeScript("scroll(0,-250);");
	}
	
}
