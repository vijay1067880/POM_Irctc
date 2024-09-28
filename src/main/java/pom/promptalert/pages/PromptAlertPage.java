package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class PromptAlertPage extends GenericWrappers{
	
	public PromptAlertPage switchToFrame() {
		switchToFrameByXpath(prop.getProperty("PromptAlertPage.SwitchToFrame.Xpath"));
		return this;
	}
	public PromptAlertPage clickOnTryIt() {
		clickByXpathNoSnap(prop.getProperty("PromptAlertPage.ClickOnTryItCTA.Xpath"));
		return this;
	}
	public PromptAlertPage enterName(String name) {
		enterDataToAlert(name);
		return this;
	}
	public PromptAlertPage getPromptAlertText() {
		String text= getAlertText();
		System.out.println(text);
		return this;
	}
    public PromptAlertPage acceptPromptAlert() {
    	acceptAlert();
    	return this;
    }
    public PromptAlertPage verifyNamePrintedInApplication(String name) {
    	verifyTextContainsByXpath(prop.getProperty("PromptAlertPage.VerifyAlertText.Xpath"), name);
    	return this;
    }
    public PromptAlertPage refreshCurrentPage() {
    	refreshPage();
    	return this;
    }
    public PromptAlertPage enterNameToAlert(String name) {
    	enterDataToAlert(name);
    	return this;
    }
    public PromptAlertPage getAlertTextToPrint() {
    	String txt =  getAlertText();
    	System.out.println(txt);
    	return this;
    }
    public PromptAlertPage dismissPromptAlert() {
    	dismissAlert();
    	return this;
    }
    public PromptAlertPage verifyAlertTextNameNotPrintedInApplication(String text) {
    	verifyTextContainsByXpath(prop.getProperty("PromptAlertPage.VerifyAlertText.Xpath"), text);
    	return this;
    }
    public PromptAlertPage switchToContent() {
		switchToDefaultContent();
		return this;
	}
    public HomePage clickOnHomeButton() {
    	clickByXpath(prop.getProperty("PromptAlertPage.ClickOnHomeButton.Xpath"));
    	return new HomePage();
    }
}
