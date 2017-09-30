package com.scp.selenium.SeleniumSamples;
/**
 * 
 * Install git 
 * 
 */
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.scp.pageobjects.PracticeForm;
import com.scp.selenium.constants.AppConstants;
import com.scp.selenium.constants.AppConstants.BrowserTypes;
import com.scp.selenium.constants.AppConstants.GenderTypes;
import com.scp.utilities.GenericMethods;

public class PracticeFormTest {

	
	@Test
	public void fillPracticeForm() throws InterruptedException, AWTException {
		WebDriver driver = GenericMethods.initilizeWebDriver(BrowserTypes.Firefox);
		PracticeForm form = PageFactory.initElements(driver,PracticeForm.class);
		form.enterNames("Yogesh","Chame");
		Thread.sleep(2000);
		form.selectGender(GenderTypes.Male);
		Thread.sleep(2000);
		form.selectYearOfExp(7);
		Thread.sleep(2000);
		form.enterDate("09/30");
		Thread.sleep(2000);
		form.selectProfession(AppConstants.Experties.Manual,AppConstants.Experties.Automation);
		Thread.sleep(2000);
		form.selectAutomationTool(AppConstants.AutomationTools.QTP,AppConstants.AutomationTools.Webdriver);
		Thread.sleep(2000);
		form.selectContinents("Australia");
		Thread.sleep(2000);
		form.selectSeleniumCommands("Browser Commands","Switch Commands","Navigation Commands");
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
