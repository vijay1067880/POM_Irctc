package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.simplealert.pages.SimpleAlertPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To validate simple alert";
		author="Vijay";
		category="smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		
	}
	@Test
	 public void simpleAlert() {
		  
		 new SimpleAlertPage()
		 .switchToFrame()
		 .clickOnTryIt()
		 .getAlertTextAndPrint()
		 .acceptSimpleAlert()
		 .switchToContent()
		 .clickOnHomeButton()
		;
	 }
}
