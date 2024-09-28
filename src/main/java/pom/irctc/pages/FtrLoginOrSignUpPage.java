package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrLoginOrSignUpPage extends GenericWrappers{
	
	public FtrLoginOrSignUpPage switchToNextWindow() {
	   	 switchToLastWindow();
	   	return this;
	   }
	public FtrUserRegistrationPage clickOnSignUpButton() {
		clickByXpath("//*[contains(text(),'New User? Signup')]");
		return new FtrUserRegistrationPage();
	}
}
