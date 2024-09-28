package pom.confirmationalert.pages;

import wrappers.GenericWrappers;

public class ConfirmationAlertPage extends GenericWrappers{
	
	public ConfirmationAlertPage switchToFrame() {
		switchToFrameByXpath(prop.getProperty("ConfirmationAlertPage.SwitchToFrame.Xpath"));
		return this;
	}

	public ConfirmationAlertPage clickOnTryIt() {
		
		clickByXpathNoSnap(prop.getProperty("ConfirmationAlertPage.ClickOnTryItCTA.Xpath"));
		return this; 
	}
	public ConfirmationAlertPage getAlertTextAndPrint() {
		String alerttext =  getAlertText();
		System.out.println(alerttext);
		return this;
	}
	public ConfirmationAlertPage acceptConfirmationAlert() {
		acceptAlert();
		return this;
	}
	public ConfirmationAlertPage verifyAlertTextForAcceptAlert(String text) {
		verifyTextByXpath(prop.getProperty("ConfirmationAlertPage.VerifyAlertText.Xpath"),text);
		return this;
	}
	public ConfirmationAlertPage refreshCurrentPage() {
		refreshPage();
		return this;
	}
	public ConfirmationAlertPage clickOnTryItSecondTime() {
		clickByXpathNoSnap(prop.getProperty("ConfirmationAlertPage.ClickOnTryItCTA.Xpath"));
		return this;
	}
	public ConfirmationAlertPage getAlertTextAndPrintSecondTime() {
		String text =  getAlertText();
		System.out.println(text);
		return this;
	}
	public ConfirmationAlertPage acceptAlertSecondTime() {
		acceptAlert();
		return this;
	}
	public ConfirmationAlertPage dismissConfirmationAlert() {
		dismissAlert();
		return this;
		}
	public ConfirmationAlertPage verifyTextPrintedForDismissAlert(String text) {
		verifyTextByXpath(prop.getProperty("ConfirmationAlertPage.VerifyTextPrintedForDismissALert.Xpath"), text);
		return this;
	}
	public ConfirmationAlertPage switchToNormalContent() {
		switchToDefaultContent();
		return this;
	}
	public HomePage clickOnHomeButton() {
		clickByXpath(prop.getProperty("ConfirmationAlertPage.ClickOnHomeButton.Xpath"));
		return new HomePage();
	}
}

