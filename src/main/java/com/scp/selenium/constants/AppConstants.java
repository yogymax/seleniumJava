package com.scp.selenium.constants;

public class AppConstants {

	public static final String APPLICATION_URL="http://toolsqa.com/automation-practice-form/";
	
	
	public enum BrowserTypes{
		Firefox,
		Chrome,
		Safari,
		IE
	}
	
	public enum GenderTypes{
		Male,
		Female
	}
	
	
	public enum Experties {
		Manual("Manual Tester"),
		Automation("Automation Tester");
		   
		   private String value;
		   Experties(String p) {
		      value = p;
		   }
		   String getValue() {
		      return value;
		   } 
		}
	
	public enum AutomationTools{
		QTP("QTP"),
		Webdriver("Selenium Webdriver"),
		IDE("Selenium IDE");
		
		private String value;
		
		AutomationTools(String v){
			value=v;
		}
		
		String getValue(){
			return value;
		}
		
	}
	
	
	public enum scollDirection{
		UP,
		DOWN
	}

		
}
