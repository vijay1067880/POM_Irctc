package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.confirmationalert.pages.ConfirmationAlertPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To validate confirmation alert";
		author="Vijay";
		category="smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		sheetName="TC008";
	}
	@Test(dataProvider = "fetchData")
	 public void confirmationAlert(String text1 , String text2) {
		 
		  new ConfirmationAlertPage() 
		  .switchToFrame()
		  .clickOnTryIt()
		  .getAlertTextAndPrint()
		  .acceptConfirmationAlert()
		  .verifyAlertTextForAcceptAlert(text1)
		  .refreshCurrentPage()
		  .switchToFrame()
		  .clickOnTryItSecondTime()
		  .getAlertTextAndPrintSecondTime()
		  .acceptAlertSecondTime()
		  .clickOnTryIt()
		  .dismissConfirmationAlert()
		  .verifyTextPrintedForDismissAlert(text2)
		  .switchToNormalContent()
		  .clickOnHomeButton()
		 ;
	 }
} 
