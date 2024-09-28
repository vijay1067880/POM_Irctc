package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.promptalert.pages.PromptAlertPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
    
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To validate prompt alert";
		author="Vijay";
		category="smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		sheetName="TC009";
	}
	@Test(dataProvider = "fetchData")
	public void promptAlert(String name1, String name2, String name3, String name4) {
		
		new PromptAlertPage() 
		.switchToFrame()
		.clickOnTryIt()
		.enterName(name1)
		.getAlertTextToPrint()
		.acceptPromptAlert()
		.verifyNamePrintedInApplication(name2)
		.refreshCurrentPage()
		.switchToFrame()
		.clickOnTryIt()
		.enterNameToAlert(name3)
		.getAlertTextToPrint()
		.dismissPromptAlert()
		.verifyAlertTextNameNotPrintedInApplication(name4)
		.switchToContent()
		.clickOnHomeButton()
		;
		
	}
}
