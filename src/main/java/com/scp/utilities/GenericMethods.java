package com.scp.utilities;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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
	 * @throws AWTException 
	 * @throws InterruptedException 
	 */
	public static WebDriver initilizeWebDriver(AppConstants.BrowserTypes browser) throws AWTException, InterruptedException {
		switch (browser) {
		case Firefox:
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("log", "{level: trace}");
			capabilities.setCapability("marionette", true);
			capabilities.setCapability("moz:firefoxOptions", options);
			System.setProperty("webdriver.gecko.driver","E:\\MySofts\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case Chrome:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
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
