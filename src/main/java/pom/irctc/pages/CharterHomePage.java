package pom.irctc.pages;


import wrappers.GenericWrappers;

public class CharterHomePage extends GenericWrappers{
	
	public CharterHomePage clickOnSideMenuDismiss() {
		clickByXpath("//*[@id='dismiss']");
		return this;
	}
	public EnquiryFormPage clickOnEnquiryFormTab() {
		clickByXpath("//*[text()='Enquiry Form']");
		return new EnquiryFormPage();
	}
}
