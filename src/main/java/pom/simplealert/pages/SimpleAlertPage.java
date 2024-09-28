package pom.simplealert.pages;

import wrappers.GenericWrappers;

public class SimpleAlertPage extends GenericWrappers {

	public SimpleAlertPage switchToFrame() {
		switchToFrameByXpath(prop.getProperty("SimpleAlertPage.SwitchToFrame.Xpath"));
		return this;
	}
	public SimpleAlertPage clickOnTryIt() {
		clickByXpathNoSnap(prop.getProperty("SimpleAlertPage.ClickOnTryItCTA.Xpath"));
		return this;
	}

	public SimpleAlertPage getAlertTextAndPrint() {
		String alerttxt =  getAlertText();
		System.out.println(alerttxt);
		return this;
	}
	public SimpleAlertPage acceptSimpleAlert(){
		acceptAlert();
		return this;
	}
	public SimpleAlertPage switchToContent() {
		switchToDefaultContent();
		return this;
	}
	public HomePage clickOnHomeButton() {
		clickByXpathNoSnap(prop.getProperty("SimpleAlertPage.ClickOnHomeButton.Xpath"));
		return new HomePage(); 
	}
}
