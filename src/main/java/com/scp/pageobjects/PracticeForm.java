package com.scp.pageobjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.scp.selenium.constants.AppConstants;
import com.scp.selenium.constants.AppConstants.scollDirection;
import com.scp.utilities.GenericMethods;

/**
 * 
 * @author Yogesh
 *
 */
public class PracticeForm {
	
	public static Logger log = Logger.getLogger(PracticeForm.class);
	
	@FindBy(name="firstname")
	WebElement firstnameInput;
	
	@FindBy(name="lastname")
	WebElement lastnameInput;
	
	@FindBy(name="sex")
	List<WebElement> genderTypes;
	
	@FindBy(name="exp")
	List<WebElement> experience;
	
	@FindBy(id="datepicker")
	WebElement date;
	
	@FindBy(name="profession")
	List<WebElement> profession;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[8]/a")
	WebElement downloadLink;
	
	@FindBy(name="tool")
	List<WebElement> automationTool;
	
	@FindBy(id="continents")
	WebElement countryNames;
	
	@FindBy(id="selenium_commands")
	WebElement seleniumCommands;
	
	
	public void enterNames(String fName,String lName){
		log.info("FirstName : " +fName);
		log.info("LastName : " +lName);
		
		this.firstnameInput.clear();
		this.lastnameInput.clear();
		
		this.firstnameInput.sendKeys(fName);
		this.lastnameInput.sendKeys(lName);
		
		log.info("enterNames method execution completed...!");
	}

	public void selectGender(AppConstants.GenderTypes gender){
		log.info("Gender To be selected : " +gender);
		for(WebElement gen : genderTypes){
			if(gen.getAttribute("value").equalsIgnoreCase(gender.toString())){
				gen.click();
				log.info("Selected value" +gen.getAttribute("value"));
				break;
			}
		}
	
		GenericMethods.scrollPage(scollDirection.DOWN);
		GenericMethods.scrollPage(scollDirection.DOWN);
	}

	public void selectYearOfExp(int p_exp){
		boolean flag = false;
		for(WebElement exp : experience){
			if(exp.getAttribute("value").trim().equalsIgnoreCase(Integer.toString(p_exp))){
				exp.click();
				flag=true;
				break;
			}
		}
		Assert.assertTrue(flag,"wrong input");
	}
	
	
	public void enterDate(String p_date){
		this.date.clear();
		this.date.sendKeys(p_date);
	}
	
	
	
	public void selectProfession(AppConstants.Experties ...prof){
		for (int i = 0; i < prof.length; i++) {
			for(WebElement p : profession){
				if(p.getAttribute("value").trim().equalsIgnoreCase(prof[i].getValue())){
					p.click();
					break;
				}
			}
				
		}
		
	}
	
	public void selectAutomationTool(AppConstants.AutomationTools ...tool){
		for (int i = 0; i < tool.length; i++) {
			for(WebElement p : automationTool){
				if(p.getAttribute("value").trim().equalsIgnoreCase(tool[i].getValue())){
					p.click();
					break;
				}
			}
				
		}
		
	}
	
	public void selectContinents(String countries){
		Select select = new Select(countryNames);
		select.selectByVisibleText(countries);
	}
	
	
	public void selectSeleniumCommands(String ...seleniumCmds){
		Select select = new Select(seleniumCommands);
		for (String cmd : seleniumCmds) {
			select.selectByVisibleText(cmd);
		}
		
	}
	
}
